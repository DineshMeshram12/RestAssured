package APIRestAssuredExamplesForGranthaa;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class putRequest {
	
	@Test
	public void putRequestForLeader() {
		
		//Request Body
		Map<String, String> body = new HashMap<>();
		body.put("name", "Jagadish 2");
		body.put("email", "jagadish2@gmail.com");
	    body.put("role", "leader");
		body.put("contact_no", "9876543224");
		
		//Send Put Request
		Response response = given()

		        .header("Authorization",
		                "Bearer 132|tElTSRHFm2Miy1OQbkLiZZ2OtFTSBkLGdWFtGxMMc775ae5f")

		        .header("Accept", "application/json")

		        .contentType("application/json")

		        .body(body)

		.when()

		        .patch("https://granthaadeveloperpvtltd.com/qa/apis/api/users/37");
		
		//Print Response
		response.then().log().all();
	
		
		//Validation
		response.then()
		
		.statusCode(anyOf(is(200), is(201)))
		.body("message", containsString("updated"));
		//.body("user.name", equalTo("Jagdish 2"));
	}
	
	

}
