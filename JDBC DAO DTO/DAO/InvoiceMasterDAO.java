package DAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import DTO.InvoiceMaster;

public interface InvoiceMasterDAO {

	int insertInvoice(InvoiceMaster invoice) throws SQLException;

	int updateDate(int invoiceId, Date date) throws SQLException;

	int updateDiscount(int invoiceId, int discount) throws SQLException;

	InvoiceMaster retrieveInvoiceId(int invoiceId) throws SQLException;

	List<InvoiceMaster> findAll() throws SQLException;

	int deleteInvoiceById(int invoiceId) throws SQLException;

}
