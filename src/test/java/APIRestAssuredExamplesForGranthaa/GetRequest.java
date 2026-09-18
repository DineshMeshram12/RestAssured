package APIRestAssuredExamplesForGranthaa;

import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

@Test
 public class GetRequest {
	
	public void getLeaderDetailsTest() {
	
	Response  res = RestAssured
			.given()
			.header("Authorization","Bearer 132|tElTSRHFm2Miy1OQbkLiZZ2OtFTSBkLGdWFtGxMMc775ae5f")
			.header("Accept", "Application/json")
			.when()
			.get("https://granthaadeveloperpvtltd.com/qa/apis/api/users/37");
	
	      
	  //Print Response
	  res.then().log().all();
	  
	  //Print Status Code
	  System.out.println("Status Code:" + res.statusCode());
	  
	  //Print Response Body
	  System.out.println("Response Body: ");
	  System.out.println(res.asPrettyString());
	  
	  //Validation
	  res.then()
	  .statusCode(200)
	  .body("message", equalTo("User fetched successfully"))
      .body("data.id", equalTo(37))
      .body("data.role", equalTo("leader"))
      .body("data.name", equalTo("Jagadish 2"));
	
	
	}
	
}
