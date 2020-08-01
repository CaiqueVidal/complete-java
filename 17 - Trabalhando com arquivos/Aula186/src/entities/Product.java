package entities;

public class Product {

	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double totalPrice() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return name + "," + String.format("%.2f", totalPrice());
	}
	
}
