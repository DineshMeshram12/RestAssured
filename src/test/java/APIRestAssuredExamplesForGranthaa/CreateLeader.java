package APIRestAssuredExamplesForGranthaa;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;


import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CreateLeader {
	
	@Test
    public void leaderCreateAPITest() {

        // Correct baseURI
         baseURI = "https://granthaadeveloperpvtltd.com/qa/";
         
         Map<String, String> body = new HashMap<>();
         body.put("name", "Jagdish");
         body.put("email", "jagdish@gmail.com");
         body.put("aadhaar_number", "254578964565");
         body.put("role", "leader");
         body.put("pancard_number", "SDFRT2545I");
         body.put("bank_name", "SBI");
         body.put("bank_branch", "Chandrapur");
         body.put("bank_account_no", "2154788965326545");
         body.put("bank_ifsc_code", "SBIN0004524");
         body.put("age", "30");
         body.put("gender", "male");
         body.put("contact_no", "9876543235");
         body.put("address", "Pathanpura Ward");
         
         
         
        
         
      // Send POST Request
	        Response response = given()
	        		.redirects().follow(true)
	        		.header("Authorization","Bearer 132|tElTSRHFm2Miy1OQbkLiZZ2OtFTSBkLGdWFtGxMMc775ae5f")
	        		.header("Accept", "application/json")
	        		.contentType("application/json")
	        		.body(body)
	        		.when()
	        		.post("/qa/apis/api/users");
	        

	        //Print Response
	        System.out.println("Response: " + response.asString());
	        System.out.println(response.getStatusLine());
	        System.out.println(response.getHeaders());
	        System.out.println(response.asPrettyString());
	        
	        
	     // Print full response
	        response.then().log().all();
	        
	        //Check Validation
	        response
	        .then().statusCode(201)
	        .header("Content-Type", containsString("application/json"))
	        .body("message", equalTo("Leader created successfully"))
	        .body("user.email", equalTo("jagdish@gmail.com"))
	        .body("user.role", equalTo("leader"))
	        .header("Content-Type", containsString("application/json"))
	        .time(lessThan(3000L));
	        
	        


}
}
