package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import DTO.InvoiceTransfer;

public class InvoiceTransfersDAO implements InvoiceTransferDAO {
	private Connection con;

	public InvoiceTransfersDAO(Connection con) {
		this.con = con;
	}

	@Override
	public int insertInvoiceTransfer(InvoiceTransfer invoice) throws SQLException {
		String sql = "insert into invoice_transfer values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, invoice.getInvoiceId());
		ps.setInt(2, invoice.getItemId());
		ps.setInt(3, invoice.getQty());
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateItemIDByInvoiceId(int invoiceId, int itemId) throws SQLException {
		String sql = "update invoice_transfer set  item_id = ? where  invoice_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, itemId);
		ps.setInt(2, invoiceId);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateQtyInvoiceId(int invoiceId, int qty) throws SQLException {
		String sql = "update invoice_transfer set  qty = ? where  invoice_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, qty);
		ps.setInt(2, invoiceId);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateInvoiceIdByItemId(int invoiceId, int itemId) throws SQLException {
		String sql = "update invoice_transfer set  invoice_id = ? where  item_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, invoiceId);
		ps.setInt(2, itemId);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int updateQtyByItemId(int qty,int itemId) throws SQLException {
		String sql = "update invoice_transfer set  qty = ? where  item_id=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, qty);
		ps.setInt(2, itemId);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public InvoiceTransfer retrieveInvoiceTransferByInvoiceId(int invoiceId) throws SQLException {
		String sql = "select * from invoice_transfer where invoice_id =?   ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, invoiceId);
		ResultSet rs = ps.executeQuery();
		InvoiceTransfer invoice = new InvoiceTransfer();
		if (rs.next()) {
			invoice.setInvoiceId(rs.getInt(1));
			invoice.setItemId(rs.getInt(2));
			invoice.setQty(rs.getInt(3));
		}

		return invoice;
	}

	@Override
	public InvoiceTransfer retrieveInvoiceTransferByItemId(int itemId) throws SQLException {
		String sql = "select * from invoice_transfer where item_id =?   ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, itemId);
		ResultSet rs = ps.executeQuery();
		InvoiceTransfer invoice = new InvoiceTransfer();
		if (rs.next()) {
			invoice.setInvoiceId(rs.getInt(1));
			invoice.setItemId(rs.getInt(2));
			invoice.setQty(rs.getInt(3));
		}

		return invoice;
	}

	@Override
	public List<InvoiceTransfer> findAll() throws SQLException {
		String sql = "select * from invoice_transfer ;";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<InvoiceTransfer> InvoiceTransferlist = new LinkedList<InvoiceTransfer>();
		while (rs.next()) {
			InvoiceTransfer invoice = new InvoiceTransfer();
			invoice.setInvoiceId(rs.getInt(1));
			invoice.setItemId(rs.getInt(2));
			invoice.setQty(rs.getInt(3));
			InvoiceTransferlist.add(invoice);
		}
		return InvoiceTransferlist;
	}

	@Override
	public int deleteInvoiceTransferByInvoiceId(int invoiceId) throws SQLException {
		String sql = "DELETE FROM invoice_transfer WHERE invoice_id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, invoiceId);
		int result = ps.executeUpdate();
		return result;
	}

	@Override
	public int deleteInvoiceTransferByItemId(int itemId) throws SQLException {
		String sql = "DELETE FROM invoice_transfer WHERE item_id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, itemId);
		int result = ps.executeUpdate();
		return result;
	}

}
