package com.api.base;

import io.restassured.response.Response;

public class ProductService extends BaseService{
	
	public static final String BASE_PATH="/products/";
	
	public Response addProduct(Object payload) {
		return postRequest(payload,BASE_PATH+"add");
	}

}
