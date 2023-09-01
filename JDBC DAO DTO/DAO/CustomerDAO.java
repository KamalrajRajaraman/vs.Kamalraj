package DAO;

import java.sql.SQLException;
import java.util.List;

import DTO.Customer;

public interface CustomerDAO {
	int insertCustomer(Customer customer) throws SQLException;

	int updateCustomerName(int customerId, String name) throws SQLException;

	int updateCustomerAddress(int customerId, String name) throws SQLException;

	int updateCustomerTel(int customerId, long num) throws SQLException;

	Customer retrieveCustomerById(int customerId) throws SQLException;

	List<Customer> findAll() throws SQLException;

	int deleteCustomerById(int customerId) throws SQLException;

}
