package DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import DTO.Item;


public class ItemsDAO implements ItemDAO {
	private Connection con;

	public ItemsDAO(Connection con) {
		this.con = con;
	}
	
	@Override
	public int insertItem(Item item) throws SQLException {
		String sql = "insert into item_master values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, item.getItemId());
		ps.setString(2, item.getItemName());
		ps.setString(3, item.getUnit());
		ps.setFloat(4, item.getPrice());
		ps.setBytes(5, item.getImage());
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateItemName(int itemid, String itemName) throws SQLException {
		String sql = "update  item_master set item_name = ? where item_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, itemName);
		ps.setInt(2, itemid);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateUnit(int itemid, String unit) throws SQLException {
		String sql = "update  item_master set unit = ? where item_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, unit);
		ps.setInt(2, itemid);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updatePrice(int itemid, float price) throws SQLException {
		String sql = "update  item_master set price = ? where item_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setFloat(1, price);
		ps.setInt(2, itemid);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateImage(int itemid, String imagePath) throws SQLException, IOException {
		String sql = "update  item_master set image = ? where item_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);

		FileInputStream fis = new FileInputStream(imagePath);
		byte[] b = new byte[fis.available()];
		fis.read(b);
		fis.close();

		ps.setBytes(1, b);
		ps.setInt(2, itemid);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public Item retrieveItem(int itemid) throws SQLException {
		String sql = "select * from item_master where item_id =?   ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, itemid);
		ResultSet rs = ps.executeQuery();
		Item item = new Item();
		if (rs.next()) {
			item.setItemId(rs.getInt(1));
			item.setItemName(rs.getString(2));
			item.setUnit(rs.getString(3));
			item.setPrice(rs.getFloat(4));
			item.setImage(rs.getBytes(5));
		}

		return item;
	}

	@Override
	public List<Item> findAll() throws SQLException {
		String sql = "select * from item_master;";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Item> itemList = new LinkedList<Item>();
		while (rs.next()) {
			Item item = new Item();
			item.setItemId(rs.getInt(1));
			item.setItemName(rs.getString(2));
			item.setUnit(rs.getString(3));
			item.setPrice(rs.getFloat(4));
			item.setImage(rs.getBytes(5));
			itemList.add(item);
		}

		return itemList;
	}

	@Override
	public int deleteItembyId(int itemid) throws SQLException {
		String sql = "DELETE FROM item_master WHERE item_id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, itemid);
		int result = ps.executeUpdate();
		return result;
	}

}
