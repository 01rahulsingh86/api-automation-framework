package com.api.base;

import com.api.models.requests.LoginRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{
	// This is Authentication Service which will pass payload and return response
	private static final String BASE_PATH="/auth/";
	
	public Response login(LoginRequest payload) {
		return postRequest(payload,BASE_PATH+"login");
	}
}
