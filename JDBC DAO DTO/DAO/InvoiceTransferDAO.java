package DAO;

import java.sql.SQLException;
import java.util.List;

import DTO.InvoiceTransfer;

public interface InvoiceTransferDAO {

	int insertInvoiceTransfer(InvoiceTransfer invoice) throws SQLException;

	int updateItemIDByInvoiceId(int invoiceId, int itemId) throws SQLException;

	int updateQtyInvoiceId(int invoiceId, int qty) throws SQLException;

	int updateInvoiceIdByItemId(int invoiceId, int itemId) throws SQLException;

	int updateQtyByItemId(int itemId, int qty) throws SQLException;

	InvoiceTransfer retrieveInvoiceTransferByInvoiceId(int invoiceId) throws SQLException;

	InvoiceTransfer retrieveInvoiceTransferByItemId(int itemId) throws SQLException;

	List<InvoiceTransfer> findAll() throws SQLException;

	int deleteInvoiceTransferByInvoiceId(int invoiceId) throws SQLException;

	int deleteInvoiceTransferByItemId(int itemId) throws SQLException;
}
