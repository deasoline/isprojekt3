package isprojekt3.models;

public class OrderRow {
	private int number;
	private int count;
	private Product product;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int n) {
		number = n;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int c) {
		count = c;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product p) {
		product = p;
	}
}
