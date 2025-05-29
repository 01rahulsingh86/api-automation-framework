package com.api.models.response;

public class AddProductResponse {
	String id;
	String title;
	String price;
	String description;
	String brand;
	
	public AddProductResponse() {};
	
	public AddProductResponse(String id, String title, String price, String description, String brand) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.description = description;
		this.brand = brand;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "AddProductResponse [id=" + id + ", title=" + title + ", price=" + price + ", description=" + description
				+ ", brand=" + brand + "]";
	}

}
