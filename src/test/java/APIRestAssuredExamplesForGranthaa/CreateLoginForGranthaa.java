package APIRestAssuredExamplesForGranthaa;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;


import io.restassured.response.Response;

public class CreateLoginForGranthaa {
	
	 @Test
	    public void loginAPITest() {

	        // Correct baseURI
	         baseURI = "https://granthaadeveloperpvtltd.com";

	        // Request Body
	        Map<String, String> body = new HashMap<>();
	        body.put("login", "admin@example.com");
	        body.put("password", "password");

	        // Send POST Request
	        Response response = given()
	        		.redirects().follow(true)
	        		.header("Content-Type", "application/json")
	        		.body(body)
	        		.when()
	        		.post("/qa/apis/api/login");
	        
	        //Print Response
	        System.out.println("Response: " + response.asString());
	        
	        
	     // Print full response
	        response.then().log().all();
	        
	        //Check Validation
	        response.then().statusCode(200);
	        
	        //Validate token (if present)
	        response.then().body("token", notNullValue());
	        
	        //Extract token 
	        String token = response.jsonPath().getString("token");
	        System.out.println("Token: " + token);
	        
				
				
	

	 
	 }

	

	

	
	 }


