package isprojekt3.models;

import java.util.Date;
import java.util.HashMap;

public class Order {
	private int id;
	private Date deliveryDate;
	private Customer customer;
	private HashMap<Integer, OrderRow> rows = new HashMap<Integer, OrderRow>();
	
	public int getId() {
		return id;
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	
	public void setDeliveryDate(Date d) {
		deliveryDate = d;
	}
	
	public Customer getCustomer()  {
		return customer;
	}
	
	public void setCustomer(Customer c) {
		customer = c;
	}
	
	public HashMap<Integer, OrderRow> getRows() {
		return rows;
	}
	
	public void addRow(OrderRow r) {
		rows.put(r.getNumber(), r);
	}

	public OrderRow deleteRow(int n) {
		return rows.remove(n);
	}
}
