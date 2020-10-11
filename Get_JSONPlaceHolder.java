package jsonPlaceHolderPKG;

import static io.restassured.RestAssured.get;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Get_JSONPlaceHolder {

	
	@Test(priority = 1, alwaysRun = true)
	void Filter_UsersData()
	{
		Response response = get("https://jsonplaceholder.typicode.com/users");

		JsonPath id = new JsonPath(response.asString());
		String IDNumber = id.getString("id");
		System.out.println("id...." + IDNumber);
		
		JsonPath name = new JsonPath(response.asString());
		String names = name.getString("name");
		System.out.println("nameSize...." + names);
		
		JsonPath userName = new JsonPath(response.asString());
		String userNames = userName.getString("username");
		System.out.println("userName...." + userNames);
		
		JsonPath email = new JsonPath(response.asString());
		String emails = email.getString("email");
		System.out.println("emails...." + emails);
		
		JsonPath addressStreets = new JsonPath(response.asString());
		String addressStreet = addressStreets.getString("address.street");
		System.out.println("addressStreets...." + addressStreet);
		
		JsonPath addressSuites = new JsonPath(response.asString());
		String addressSuite = addressSuites.getString("address.suite");
		System.out.println("addressSuites...." + addressSuite);
		
		JsonPath addressCities = new JsonPath(response.asString());
		String addressCity = addressCities.getString("address.city");
		System.out.println("addressCities...." + addressCity);
		
		JsonPath addressZipCodes = new JsonPath(response.asString());
		String addressZipCode = addressZipCodes.getString("address.zipcode");
		System.out.println("addressZipCodes...." + addressZipCode);
		
		JsonPath addressGeoLats = new JsonPath(response.asString());
		String addressGeoLat = addressGeoLats.getString("address.geo.lat");
		System.out.println("addressGeoLats...." + addressGeoLat);
		
		JsonPath addressGeoLongs = new JsonPath(response.asString());
		String addressGeoLong = addressGeoLongs.getString("address.geo.lng");
		System.out.println("addressGeoLongs...." + addressGeoLong);
		
		JsonPath phone = new JsonPath(response.asString());
		String phones = phone.getString("phone");
		System.out.println("phone...." + phones);
		
		JsonPath website = new JsonPath(response.asString());
		String websites = website.getString("website");
		System.out.println("websites...." + websites);
		
		JsonPath CompanyNames = new JsonPath(response.asString());
		String CompanyName = CompanyNames.getString("company.name");
		System.out.println("CompanyNames...." + CompanyName);
		
		JsonPath CompanyCatchPhrases = new JsonPath(response.asString());
		String CompanyCatchPhrase = CompanyCatchPhrases.getString("company.catchPhrase");
		System.out.println("CompanyCatchPhrases...." + CompanyCatchPhrase);
		
		JsonPath CompanyBSS = new JsonPath(response.asString());
		String CompanyBS = CompanyBSS.getString("company.bs");
		System.out.println("CompanyBSS...." + CompanyBS);

		System.out.println("Response status code is ..." + response.statusCode());
	}
	
	
}
