package com.api.models.requests;

public class AddProductRequest {
	//POJO Class for request Payload
	String title;
	String description;
	String price;
	String brand;

	public AddProductRequest() {};
	
	@Override
	public String toString() {
		return "AddProductRequest [title=" + title + ", description=" + description + ", price=" + price + ", brand="
				+ brand + "]";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public AddProductRequest(String title, String description, String price, String brand) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.brand = brand;
	}
	
}
