package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import DTO.Bill;
import DTO.Customer;
import DTO.InvoiceMaster;
import DTO.InvoiceTransfer;
import DTO.Item;

public class InvoiceMastersDAO implements InvoiceMasterDAO {
	private Connection con;

	public InvoiceMastersDAO(Connection con) {
		this.con = con;
	}

	public int insertEntireinvoiceData(Bill bill) throws SQLException {
		InvoiceMaster invoice = new InvoiceMaster();
		invoice.setInvoiceId(bill.getInvoiceId());
		invoice.setInvoiceDate(bill.getInvoiceDate());
		invoice.setDiscount(bill.getDiscount());
		invoice.setCustomerId(bill.getCustomerId());

		Customer customer = new Customer();
		customer.setCustomerId(bill.getCustomerId());
		customer.setCustomerName(bill.getCustomerName());
		customer.setCustomerAddress(bill.getCustomerAddress());
		customer.setCustomerTel(bill.getCustomerTel());

		InvoiceTransfer invoiceTrans = new InvoiceTransfer();
		invoiceTrans.setInvoiceId(bill.getInvoiceId());
		invoiceTrans.setItemId(bill.getItemId());
		invoiceTrans.setQty(bill.getQty());

		Item item = new Item();
		item.setItemId(bill.getItemId());
		item.setItemName(bill.getItemName());
		item.setUnit(bill.getUnit());
		item.setPrice(bill.getPrice());
		item.setImage(bill.getImage());

		CustomersDAO customerDAo = new CustomersDAO(con);
		InvoiceTransfersDAO invoiceTransfersDAO = new InvoiceTransfersDAO(con);
		ItemsDAO itemsDAO = new ItemsDAO(con);

		int insertCustomer = customerDAo.insertCustomer(customer);

		int insertinvoice = this.insertInvoice(invoice);

		int insertItem = itemsDAO.insertItem(item);

		int insertInvoiceTransfer = invoiceTransfersDAO.insertInvoiceTransfer(invoiceTrans);
		
		int result = insertinvoice + insertCustomer + insertItem + insertInvoiceTransfer;
		
		return result;

	}

	@Override
	public int insertInvoice(InvoiceMaster invoice) throws SQLException {
		String sql = "insert into invoice_master values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, invoice.getInvoiceId());
		ps.setDate(2, invoice.getInvoiceDate());
		ps.setInt(3, invoice.getDiscount());
		ps.setInt(4, invoice.getCustomerId());
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateDate(int invoiceId, Date date) throws SQLException {
		String sql = "update invoice_master set invoice_date = ? where invoice_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDate(1, date);
		ps.setInt(2, invoiceId);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateDiscount(int invoiceId, int discount) throws SQLException {
		String sql = "update invoice_master set discount  = ? where invoice_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, discount);
		ps.setInt(2, invoiceId);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public InvoiceMaster retrieveInvoiceId(int invoiceId) throws SQLException {
		String sql = "select * from invoice_master where invoice_id =?   ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, invoiceId);
		ResultSet rs = ps.executeQuery();
		InvoiceMaster invoice = new InvoiceMaster();
		if (rs.next()) {
			invoice.setInvoiceId(rs.getInt(1));
			invoice.setInvoiceDate(rs.getDate(2));
			invoice.setDiscount(rs.getInt(3));
		}

		return invoice;
	}

	@Override
	public List<InvoiceMaster> findAll() throws SQLException {
		String sql = "select * from invoice_master ;";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<InvoiceMaster> InvoiceMasterlist = new LinkedList<InvoiceMaster>();
		while (rs.next()) {
			InvoiceMaster invoice = new InvoiceMaster();
			invoice.setInvoiceId(rs.getInt(1));
			invoice.setInvoiceDate(rs.getDate(2));
			invoice.setDiscount(rs.getInt(3));
			InvoiceMasterlist.add(invoice);
		}

		return InvoiceMasterlist;
	}

	@Override
	public int deleteInvoiceById(int invoiceId) throws SQLException {
		String sql = "DELETE FROM invoice_master WHERE invoice_id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, invoiceId);
		int result = ps.executeUpdate();
		return result;
	}

	public Bill getInvoice(int invoiceId) throws SQLException {
		String sql = "select * from  invoice_master t1 , " + "customer_master t2 , " + " invoice_transfer t3, "
				+ "item_master t4 " + "where t1. customer_id= t2. customer_id " + "AND  t1. invoice_id=t3. invoice_id "
				+ "AND t3. item_id=t4. item_id " + "And t1. invoice_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, invoiceId);
		ResultSet rs = ps.executeQuery();
		Bill bill = new Bill();
		if (rs.next()) {
			bill.setInvoiceId(rs.getInt(1));
			bill.setInvoiceDate(rs.getDate(2));
			bill.setDiscount(rs.getInt(3));
			bill.setCustomerId(rs.getInt(4));
			bill.setCustomerName(rs.getString(6));
			bill.setCustomerAddress(rs.getString(7));
			bill.setCustomerTel(rs.getLong(8));
			bill.setItemId(rs.getInt(10));
			bill.setQty(rs.getInt(11));
			bill.setItemName(rs.getString(13));
			bill.setUnit(rs.getString(14));
			bill.setPrice(rs.getInt(15));
			bill.setImage(rs.getBytes(16));
		}
		return bill;

	}

}
