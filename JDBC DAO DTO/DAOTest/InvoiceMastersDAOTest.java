package DAOTest;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import DAO.CustomerDAO;
import DAO.CustomersDAO;
import DAO.InvoiceMastersDAO;
import DTO.Bill;
import DTO.Customer;
import DTO.InvoiceMaster;

@TestMethodOrder(OrderAnnotation.class)
class InvoiceMastersDAOTest {
	static Connection con;
	static InvoiceMastersDAO i;
	static CustomerDAO c ;

	@BeforeAll
	public static void test() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		con = DriverManager.getConnection(url, user, password);
		i = new InvoiceMastersDAO(con);
		 c = new CustomersDAO(con);
		Customer cm = new Customer();
		cm.setCustomerName("Kamal");
		cm.setCustomerId(11);
		cm.setCustomerTel(842883852);
		cm.setCustomerAddress("11,ms pillai nagar");
		c.insertCustomer(cm);
	}

	
	@Order(1)
	@Test
	void testInsertEntireinvoiceData() throws SQLException {
		Bill b = new Bill();
		b.setInvoiceId(112);
		b.setInvoiceDate(Date.valueOf("2023-08-2"));
		b.setDiscount(4);
		b.setCustomerId(999);
		b.setCustomerName("HAri");
		b.setCustomerAddress("ms pillai nagar");
		b.setCustomerTel(9888);
		b.setItemId(99);
		b.setQty(7);
		b.setItemName("Lays");
		b.setUnit("2kg");
		b.setPrice(1000);
		b.setImage(null);
		i.insertEntireinvoiceData(b);
	}

	
	@Order(2)
	@Test
	void testInsertInvoice() throws SQLException {
		InvoiceMaster invoice = new InvoiceMaster();
		invoice.setInvoiceId(1);
		invoice.setDiscount(50);
		invoice.setInvoiceDate(Date.valueOf("2023-08-28"));
		invoice.setCustomerId(11);
		int actual = i.insertInvoice(invoice);
		assertEquals(1, actual);
	}

	@Order(3)
	@Test
	void testUpdateDate() throws SQLException {
		int actual = i.updateDate(1, Date.valueOf(LocalDate.now()));

		assertEquals(1, actual);
	}

	@Order(4)
	@Test
	void testUpdateDiscount() throws SQLException {
		int actual = i.updateDiscount(1, 100);
		assertEquals(1, actual);
	}

	@Order(5)
	@Test
	void testRetrieveInvoice() throws SQLException {
		InvoiceMaster expected = new InvoiceMaster();
		expected.setInvoiceId(1);

		InvoiceMaster actual = i.retrieveInvoiceId(1);
		assertEquals(expected, actual);

	}

	@Order(6)
	@Test
	void testFindAll() throws SQLException {
		List<InvoiceMaster> l = i.findAll();
		assertTrue(l instanceof List);
	}

	@Order(7)
	@Test
	void testDeleteInvoiceById() throws SQLException {
		int actual = i.deleteInvoiceById(1);
		assertEquals(1, actual);
	}
	@Order(7)
	@Test
	void testGetInvoice() throws SQLException {
		Bill b =i.getInvoice(112);
		assertEquals(112,b.getInvoiceId());
		
	}
	
	@AfterAll
	static void afterAll() throws SQLException {
			c.deleteCustomerById(11);
			Statement st = con.createStatement();
			st.addBatch("delete from invoice_master where  invoice_id=112;");
			st.addBatch("delete from invoice_transfer where  invoice_id=112;");
			st.addBatch("delete from customer_master where customer_id =999;");
			st.addBatch(" delete from item_master  where item_id =99;");
			st.executeBatch();
	}

}
