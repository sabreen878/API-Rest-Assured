package Get_PKG;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_Method {
	
	
	@Test
	void Get_Data()
	{
		Response response = get("https://trip.gw.safav2.io.safavisa.com/products");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.getBody());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 404);
	}
	
	
	
	@Test
	void Get_Status()
	{
		given().get("https://trip.gw.safav2.io.safavisa.com/products").then().statusCode(404)
		.body("external_transportations.count", equalTo(null));
	}

}
