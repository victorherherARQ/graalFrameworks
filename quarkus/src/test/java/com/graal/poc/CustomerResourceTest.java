package com.graal.poc;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CustomerResourceTest {

/*	@Test
	@Order(1)  
	public void testPostEndpoint() {
		given().when().post("/customer/victor.test@gmail.com").then().statusCode(200);
	}*/

//	@Test
//	@Order(2)
/*	public void testGetEndpoint() {
		given().when().get("/customer/victor@gmail.com").then().statusCode(200).body("email",
				is("victor@gmail.com"));
	}
*/
/*	@Test
	@Order(3)
	public void testDeleteEndpoint() {
		given().when().delete("/customer/victor.test@gmail.com").then().statusCode(200);
	}
*/
}