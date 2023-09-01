package DTO;

import java.io.Serializable;

public class InvoiceTransfer implements Serializable{
	
	private int invoiceId;
	private int itemId;
	private int qty;
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
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + invoiceId;
		result = prime * result + itemId;
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
		InvoiceTransfer other = (InvoiceTransfer) obj;
		if (invoiceId != other.invoiceId)
			return false;
		if (itemId != other.itemId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InvoiceTransfer [invoiceId=" + invoiceId + ", itemId=" + itemId + ", qty=" + qty + "]";
	}
	
	
	
	
}
