package jsonPlaceHolderPKG;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_JSONPlaceHolder {

	

	@Test
	public void Create_UsersData()
	{		
		
		JSONObject request = new JSONObject();
		
		System.out.println(request);
		System.out.println(request.toJSONString());

		given().header("content-type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(request.toJSONString()).when().post("https://jsonplaceholder.typicode.com/users")
		.then().statusCode(201).log().all();

	}
}
