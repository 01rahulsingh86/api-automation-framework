package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.ProductService;
import com.api.models.requests.AddProductRequest;
import com.api.models.response.AddProductResponse;

import io.restassured.response.Response;

public class AddProductAPITest {

	@Test
	public void addProduct() {
		AddProductRequest addproduct= new AddProductRequest("iPhone Auto Test","Automated test product","999","RestAssured");
		ProductService prodser=new ProductService();
		Response response = prodser.addProduct(addproduct);//Object to Json Seralization done here
		System.out.println(response.asPrettyString());
		AddProductResponse NewResponse = response.as(AddProductResponse.class); //deseralized object
		Assert.assertEquals(NewResponse.getBrand(),"RestAssured");
		Assert.assertEquals(NewResponse.getPrice(),"999");
		Assert.assertNotNull(NewResponse.getId());
		
	}
}
