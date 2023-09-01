package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import DTO.Customer;

public class CustomersDAO implements CustomerDAO {
	private  Connection con;

	public CustomersDAO(Connection con) {
		this.con = con;
	}

	@Override
	public int insertCustomer(Customer customer) throws SQLException {
		String sql = "insert into customer_master values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, customer.getCustomerId());
		ps.setString(2, customer.getCustomerName());
		ps.setString(3, customer.getCustomerAddress());
		ps.setLong(4, customer.getCustomerTel());
		int result = ps.executeUpdate();
		return result;

	}

	@Override
	public int updateCustomerName(int customerId, String name) throws SQLException {
		String sql = "update customer_master set customer_name = ? where  customer_id =? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, customerId);

		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateCustomerAddress(int customerId, String name) throws SQLException {
		String sql = "update customer_master set customer_address =? where  customer_id =?   ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, customerId);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateCustomerTel(int customerId, long num) throws SQLException {
		String sql = "update customer_master set customer_tel =? where  customer_id =?   ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setLong(1, num);
		ps.setInt(2, customerId);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public Customer retrieveCustomerById(int customerId) throws SQLException {
		String sql = "select * from customer_master where customer_id =?   ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, customerId);
		ResultSet rs = ps.executeQuery();
		Customer customer = new Customer();
		if (rs.next()) {
			customer.setCustomerId(rs.getInt(1));
			customer.setCustomerName(rs.getString(2));
			customer.setCustomerAddress(rs.getString(3));
			customer.setCustomerTel(rs.getLong(4));
		}

		return customer;
	}

	@Override
	public List<Customer> findAll() throws SQLException {
		String sql = "select * from customer_master ;";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Customer> customerlist = new LinkedList<Customer>();
		while (rs.next()) {
			Customer customer = new Customer();
			customer.setCustomerId(rs.getInt(1));
			customer.setCustomerName(rs.getString(2));
			customer.setCustomerAddress(rs.getString(3));
			customer.setCustomerTel(rs.getLong(4));
			customerlist.add(customer);
		}

		return customerlist;
	}

	@Override
	public int deleteCustomerById(int customerId) throws SQLException {
		String sql = "DELETE FROM customer_master WHERE customer_id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, customerId);
		int result = ps.executeUpdate();
		return result;
	}

}
