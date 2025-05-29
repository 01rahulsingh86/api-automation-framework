package com.api.base;

import static io.restassured.RestAssured.given;

import com.api.filters.LoggingFilters;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService { //Wrapper for RestAssured!!
	//BASE URL
	//CREATING REQUESITNG
	// HANDLING RESPONSE
	
	private static final String BASE_URL="https://dummyjson.com";
	private RequestSpecification requestspecification;
	
	static  {
		RestAssured.filters(new LoggingFilters());
	}
	
	
	public BaseService() { 
		requestspecification = given().baseUri(BASE_URL);
	}
	
	protected Response postRequest(Object payload, String endpoint) {
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

}
