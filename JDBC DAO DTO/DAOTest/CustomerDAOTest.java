package DAOTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import DAO.CustomerDAO;
import DAO.CustomersDAO;
import DTO.Customer;
@TestMethodOrder(OrderAnnotation.class)
class CustomerDAOTest {
	static Connection con;
	static CustomerDAO c;
	@BeforeAll
	public static void test() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		 con = DriverManager.getConnection(url, user, password);
		 c = new CustomersDAO(con);
	}
	@Order(1)
	@Test
	void testInsertCustomer() throws SQLException {
		Customer cm = new Customer();
		cm.setCustomerName("Kamal");
		cm.setCustomerId(88);
		cm.setCustomerTel(842883852);
		cm.setCustomerAddress("11,ms pillai nagar");
		assertEquals(1, c.insertCustomer(cm));
	}
	@Order(2)
	@Test
	void testUpdateCustomerName() throws SQLException {
		assertEquals(1, c.updateCustomerName(88, "Hari"));
		

	}
	@Order(3)
	@Test
	void testUpdateCustomerAddress() throws SQLException {
		assertEquals(1, c.updateCustomerAddress(88, "10,J nagar"));
		
	
	}
	@Order(4)
	@Test
	void testUpdateCustomerTel() throws SQLException {
		assertEquals(1,	c.updateCustomerTel(88, 94427180));
	
	}
	@Order(5)
	@Test
	void testRetrieveCustomerById() throws SQLException {
		Customer cm = new Customer();
		cm.setCustomerName("Hari");
		cm.setCustomerId(88);
		cm.setCustomerTel(94427180);
		cm.setCustomerAddress("10,J nagar");
		
		Customer cc  = c.retrieveCustomerById(88);
		assertEquals(cm, cc);
	}
	
	@Order(6)
	@Test
	void testFindAll() throws SQLException {
		List<Customer> ccc =c.findAll();
		assertTrue(ccc instanceof List );
	
		
	
	}
	@Order(7)
	@Test
	void testDeleteCustomerById() throws SQLException {
		assertEquals(1,	c.deleteCustomerById(88));
	
	}

}
