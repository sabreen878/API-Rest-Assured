package jsonPlaceHolderPKG;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserScenarios {

	private String validRequest1 = "https://subscription.gw.safav2.io.safavisa.com/create_new_subscription_plan";
	
    private String validRequest = "{\r\n" + 
    		"   \"module_id\": 2,\r\n" + 
    		"   \"module_name\":{\r\n" + 
    		"      \"ar\":\"hhhhhhh\"\r\n" + 
    		"   },\r\n" + 
    		"   \"duration_in_month\": 30,\r\n" + 
    		"   \"is_free\": false,\r\n" + 
    		"   \"price\": 1500,\r\n" + 
    		"   \"currency\":\"$\",\r\n" + 
    		"   \"payment_methods\": [\r\n" + 
    		"      2\r\n" + 
    		"   ],\r\n" + 
    		"   \"countries\": [\r\n" + 
    		"      \"98\"\r\n" + 
    		"   ],\r\n" + 
    		"   \"discount_value\": 100,\r\n" + 
    		"   \"discount_type\":\"2\",\r\n" + 
    		"   \"publish_date_from\":\"2021-10-10\",\r\n" + 
    		"   \"publish_date_to\":\"2022-12-31\",\r\n" + 
    		"   \"extra_data\":{\r\n" + 
    		"      \"amd\": \"Test\"\r\n" + 
    		"   },\r\n" + 
    		"   \"created_by\":\"hh44\",\r\n" + 
    		"   \"sub_modules\": [\r\n" + 
    		"      {\r\n" + 
    		"         \"lt_sub_module_id\": 9,\r\n" + 
    		"         \"verification_type\": 3,\r\n" + 
    		"         \"price_per_month\": 0,\r\n" + 
    		"         \"discount_value\": 60,\r\n" + 
    		"         \"discount_type\":\"2\",\r\n" + 
    		"         \"items\": [\r\n" + 
    		"            {\r\n" + 
    		"               \"is_limited\": false,\r\n" + 
    		"               \"lt_item_id\":\"8\",\r\n" + 
    		"               \"count\":\"65596\"\r\n" + 
    		"\r\n" + 
    		"            },\r\n" + 
    		"            {\r\n" + 
    		"               \"is_limited\": true,\r\n" + 
    		"               \"lt_item_id\":\"7\",\r\n" + 
    		"                \"count\":\"659641\"\r\n" + 
    		"            }\r\n" + 
    		"         ],\r\n" + 
    		"         \"duration_in_month\": 3\r\n" + 
    		"      }\r\n" + 
    		"   ]\r\n" + 
    		"}";
    
    
    @Test
    public void createUser() {
        Response response = given()
                .auth()
                .preemptive()
                .basic("required_username", "required_password")
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .contentType(ContentType.JSON)
                .body(validRequest)
                .post(validRequest1)
                .then().extract().response();

        Assert.assertEquals(200, response.getStatusCode());
    }
}