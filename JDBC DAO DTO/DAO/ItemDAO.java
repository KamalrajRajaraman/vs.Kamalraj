package DAO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import DTO.Item;

public interface ItemDAO {
	int insertItem(Item item) throws SQLException;

	int updateItemName(int itemid, String itemName) throws SQLException;

	int updateUnit(int itemid, String unit) throws SQLException;

	int updatePrice(int itemid, float price) throws SQLException;

	int updateImage(int itemid, String imagePath) throws SQLException, FileNotFoundException, IOException;

	Item retrieveItem(int itemid) throws SQLException;

	List<Item> findAll() throws SQLException;

	int deleteItembyId(int itemid) throws SQLException;
}
