package DTO;

import java.sql.Date;
import java.util.Arrays;

public class Bill {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private long customerTel;

	private int invoiceId;
	private Date invoiceDate;
	private int Discount;

	private int itemId;
	private int qty;

	private String itemName;
	private String unit;
	private float price;
	private byte[] image;
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
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	/**
	 * @return the customerTel
	 */
	public long getCustomerTel() {
		return customerTel;
	}
	/**
	 * @param customerTel the customerTel to set
	 */
	public void setCustomerTel(long customerTel) {
		this.customerTel = customerTel;
	}
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
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Bill [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerTel=" + customerTel + ", invoiceId=" + invoiceId + ", invoiceDate="
				+ invoiceDate + ", Discount=" + Discount + ", itemId=" + itemId + ", qty=" + qty + ", itemName="
				+ itemName + ", unit=" + unit + ", price=" + price + ", image=" + Arrays.toString(image) + "]";
	}
	
	
}
