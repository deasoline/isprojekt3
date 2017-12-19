package isprojekt3.models;

import java.util.HashMap;

public class Customer {
	private int customerNumber;
	private String name;
	private String address;
	private HashMap<Integer, Order> orders = new HashMap<Integer, Order>();
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public void setCustomerNumber(int n) {
		customerNumber = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public HashMap<Integer, Order> getOrders() {
		return orders;
	}
	
	public void addOrder(Order o) {
		orders.put(o.getId(), o);
	}
	
	public Order deleteOrder(int id) {
		return orders.remove(id);
	}
}
