package com.api.tests;
import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class LoginApiTest {

    @Test(description = "Verify if login API is working")
    public void loginTest() {
    	Map<String, String> payload = new HashMap<String, String>();
        payload.put("username", "emilys");
        payload.put("password", "emilyspass");
        
  
       Response response= given()
            .baseUri("https://dummyjson.com")
            .header("Content-Type", "application/json")
            .body(payload)
            .log().all()
        .when()
            .post("/auth/login");
        
       Assert.assertEquals(response.getStatusCode(),200);
        
        
    }
}
