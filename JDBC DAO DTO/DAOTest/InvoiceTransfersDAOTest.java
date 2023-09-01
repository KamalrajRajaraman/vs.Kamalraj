package DAOTest;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import DAO.InvoiceMastersDAO;
import DAO.InvoiceTransfersDAO;
import DTO.InvoiceTransfer;
@TestMethodOrder(OrderAnnotation.class)
class InvoiceTransfersDAOTest {
	static Connection con;
	static 	 InvoiceTransfersDAO  a;
	@BeforeAll
	public static void test() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		 con = DriverManager.getConnection(url, user, password);
		 a= new InvoiceTransfersDAO(con);
	}
	
	@Test
	void testInvoiceTransfersDAO() {
		
	}
	@Order(1)
	@Test
	void testInsertInvoiceTransfer() throws SQLException {
		InvoiceTransfer b = new InvoiceTransfer();
		b.setItemId(1);
		b.setInvoiceId(2);
		b.setQty(90);
		int actual=a.insertInvoiceTransfer(b);
		assertEquals(1, actual);
	}
	@Order(2)
	@Test
	void testUpdateItemIDByInvoiceId() throws SQLException {
		int actual=a.updateItemIDByInvoiceId(2, 300);
		assertEquals(1, actual);
	}
	@Order(3)
	@Test
	void testUpdateQtyInvoiceId() throws SQLException {
		int actual=a.updateQtyInvoiceId(2, 1000);
		assertEquals(1, actual);
	}
	@Order(4)
	@Test
	void testUpdateInvoiceIdByItemId() throws SQLException {
		int actual=a.updateInvoiceIdByItemId(1, 300);
		assertEquals(1, actual);
	}
	@Order(5)
	@Test
	void testUpdateQtyByItemId() throws SQLException {
		int actual=a.updateQtyByItemId( 900,300);
		assertEquals(1, actual);
	}
	@Order(6)
	@Test
	void testRetrieveInvoiceTransferByInvoiceId() throws SQLException {
		InvoiceTransfer expected = new InvoiceTransfer();
		expected.setItemId(300);
		expected.setInvoiceId(1);
		expected.setQty(900);
		InvoiceTransfer actual = a.retrieveInvoiceTransferByInvoiceId(1);
		assertEquals(expected, actual);
	}
	@Order(7)
	@Test
	void testRetrieveInvoiceTransferByItemId() throws SQLException {
		InvoiceTransfer c = a.retrieveInvoiceTransferByItemId(300);
		System.out.println(c);
	}
	@Order(8)
	@Test
	void testFindAll() throws SQLException {
		List<InvoiceTransfer> d = a.findAll();
		System.out.println(d);
	}
	@Order(9)
	@Test
	void testDeleteInvoiceTransferByInvoiceId() throws SQLException {
		int actual=a.deleteInvoiceTransferByInvoiceId(1);
		assertEquals(1, actual);
	}
	@Order(10)
	@Test
	void testDeleteInvoiceTransferByItemId() throws SQLException{
		int actual=a.deleteInvoiceTransferByItemId(300);
		assertEquals(0, actual);
	}

}
