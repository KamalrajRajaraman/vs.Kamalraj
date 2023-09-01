package DTO;

import java.io.Serializable;
import java.sql.Date;

public class InvoiceMaster implements Serializable {
	private int invoiceId;
	private Date invoiceDate;
	private int Discount;
	private int customerId;
	/**
	 * @return the invoiceId
	 */
	public int getInvoiceId() {
		return invoiceId;
	}
	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	/**
	 * @return the invoiceDate
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return Discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		Discount = discount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + invoiceId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceMaster other = (InvoiceMaster) obj;
		if (invoiceId != other.invoiceId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InvoiceMaster [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", Discount=" + Discount
				+ "]";
	}
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}
