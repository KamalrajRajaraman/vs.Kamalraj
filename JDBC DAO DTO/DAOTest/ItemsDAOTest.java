package DAOTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import DAO.InvoiceTransfersDAO;
import DAO.ItemsDAO;
import DTO.Item;

@TestMethodOrder(OrderAnnotation.class)
class ItemsDAOTest {
	static Connection con;
	static ItemsDAO a;

	@BeforeAll
	public static void test() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbcDemo";
		String user = "root";
		String password = "Kamalraj@123";
		con = DriverManager.getConnection(url, user, password);
		a = new ItemsDAO(con);
	}

	@Order(1)
	@Test
	void testInsertItem() throws SQLException {

		Item item = new Item();
		item.setItemId(1);
		item.setItemName("biriyani");
		item.setUnit("1 kg");
		item.setPrice(100.00f);
		a.insertItem(item);
	}

	@Order(2)
	@Test
	void testUpdateItemName() throws SQLException {
		a.updateItemName(1, "chicken biriyani");
	}

	@Order(3)
	@Test
	void testUpdateUnit() throws SQLException {
		a.updateUnit(1, "2 kg");
	}

	@Order(4)
	@Test
	void testUpdatePrice() throws SQLException {
		a.updatePrice(1, 200);
	}

	@Order(5)
	@Test
	void testUpdateImage() throws SQLException, IOException {
		a.updateImage(1, "C:\\Users\\Dell\\Desktop\\SirTeaching\\kamal.png");
	}

	@Order(6)
	@Test
	void testRetrieveItem() throws SQLException {
		Item it = a.retrieveItem(1);
		System.out.println(it);
	}

	@Order(7)
	@Test
	void testFindAll() throws SQLException {
		List<Item> l = a.findAll();
		System.out.println(l);
	}

	@Order(8)
	@Test
	void testDeleteItembyId() throws SQLException {
		a.deleteItembyId(1);
	}

}
