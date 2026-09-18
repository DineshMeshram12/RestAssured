package APIRestAssuredExamplesForGranthaa;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetRequestExample {
	@Test
	
		void testCase01() {
		    given()
		        .header("x-api-key", "pub_53e66261a982523fc4db0d836e1538ef3c1eb5abf9deb8eaa143d8546b76fbc2")
		    .when()
		        .get("https://reqres.in/api/users?page=2")
		    .then()
		        .log().body()
		        .log().status()
		        .statusCode(200)
		        .body("page", equalTo(2));
		    
		    
	}

}
