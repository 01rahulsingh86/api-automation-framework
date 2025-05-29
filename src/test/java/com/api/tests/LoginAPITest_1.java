package com.api.tests;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.requests.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
 public class LoginAPITest_1 {
	
	@Test(description = "Verify if login API is working")
    public void loginTestAuth() {
        
		LoginRequest loginreq= new LoginRequest("emilys","emilyspass"); // call POJO Class for it
		AuthService authserv=new AuthService();
		Response response = authserv.login(loginreq); //Object to Json Seralization done here
		LoginResponse loginresponse = response.as(LoginResponse.class); //deseralized object
		System.out.println(loginresponse.getAccessToken());
		Assert.assertEquals(loginresponse.getFirstName(), "Emily");
	}
}
