package isprojekt3.models;

import java.util.HashMap;

public class Product {
	private String name;
	private String category;
	private double price; 
	private HashMap<Integer, Order> orders = new HashMap<Integer, Order>();
	private HashMap<Integer, ProductCopy> copies = new HashMap<Integer, ProductCopy>();
	
	public String getName() {
		return name;
	}
	//hej
	public void setName(String n) {
		name = n;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String c) {
		category = c;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(int p) {
		price = p;
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
	
	public HashMap<Integer, ProductCopy> getCopies() {
		return copies;
	}
	
	public void addCopy(ProductCopy c) {
		copies.put(c.getSerialNumber(), c);
	}
	
	public ProductCopy deleteCopy(int id) {
		return copies.remove(id);
	}
}
