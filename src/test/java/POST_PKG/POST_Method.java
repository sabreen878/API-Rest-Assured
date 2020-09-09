package POST_PKG;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class POST_Method {

	@Test
	public void Post_Ordert()
	{
		
		JSONObject request = new JSONObject();
		
		request.put("name.ar", " ” ");
		request.put("name.en", "test");
		request.put("validation_date_from_at", "2020-12-10");
		request.put("validation_date_to_at", "2021-01-15");
		request.put("product_type_id", 1);
		request.put("product_classification_id", 1);
		request.put("product_price_type_id", 1);
		request.put("price_child",1);
		request.put("price_infant", 1);
		request.put("price_extra_bed", 1);
		
		request.put("adjustment_price_child", 1);
		request.put("adjustment_price_infant", 1);
		request.put("adjustment_price_extra_bed", 1);
		
		request.put("exchange_rate", 1);
		request.put("local_currency_id", 1);
		request.put("basic_currency_id", 1);
		
		request.put("price_room_types.room_type_id", 1);
		request.put("price_room_types.price", 1000);
		request.put("price_room_types.adjustment_price", 500);
		
		request.put("price_room_types.room_type_id", 2);
		request.put("price_room_types.price", 1000);
		request.put("price_room_types.adjustment_price", 500);
		
		request.put("discounts.plan_name", "discount_100");
		request.put("discounts.discount_type_id", 1);
		request.put("discounts.discount", 100);
		
		request.put("discounts.plan_name", "discount_50");
		request.put("discounts.discount_type_id", 2);
		request.put("discounts.discount", 100);

		request.put("items.visa.visa_option_id", 1);
		request.put("items.visa.visa_count", 100);
		request.put("items.visa.price_adult", 100);
		request.put("items.visa.price_child", 100);
		request.put("items.visa.price_infant", 100);
		request.put("items.visa.sort", 1);

		request.put("items.sightseeing.country_id", 1);
		request.put("items.sightseeing.city_id", 100);
		request.put("items.sightseeing.area_id", 100);
		request.put("items.sightseeing.name.ar", " ” ");
		request.put("items.sightseeing.name.en", "test");
		request.put("items.sightseeing.note.ar", " ” ");
		request.put("items.sightseeing.note.en", "test");
		
		
		request.put("items.sightseeing.sort", 4);
		request.put("items.sightseeing.is_include_transportation", 1);
		request.put("items.sightseeing.price_adult", 100);
		request.put("items.sightseeing.price_child", 100);
		request.put("items.sightseeing.price_infant", 100);
		
		
		request.put("insurance.name.ar", " ” ");
		request.put("insurance.name.en", "test");
		request.put("insurance.price_adult", 1000);
		request.put("insurance.price_child", 1000);
		request.put("insurance.price_infant", 500);
		request.put("insurance.sort", "4");
		
		request.put("hotels.hotel_id", 1);
		request.put("hotels.alternative_hotel_id", 1);
		request.put("hotels.check_in_at", "2021-09-06");
		request.put("hotels.night_count", 10);
		request.put("hotels.country_id", 1);
		request.put("hotels.city_id", 1);
		request.put("hotels.area_id", 1);
		request.put("hotels.is_include_sightseeing", 1);
		request.put("hotels.product_hotel_type_id", 1);
		request.put("hotels.note.ar", " ” ");
		request.put("hotels.note.en", "test");

		request.put("hotels.sort", 1);
		request.put("hotels.price_extra_bed", 100);
		request.put("hotels.price_child", 10);
		request.put("hotels.price_infant", 100);

		request.put("hotels.rooms.room_type_id", 1);
		request.put("hotels.rooms.price_adult", 100);
		request.put("hotels.rooms.count", 100);
		
		request.put("hotels.rooms.room_type_id", 2);
		request.put("hotels.rooms.price_adult", 100);
		request.put("hotels.rooms.count", 100);

		request.put("hotels.meals.meal_type_id", 1);
		request.put("hotels.meals.meal_type_id", 2);

		request.put("hotels.hotel_id", 100);
		request.put("hotels.alternative_hotel_id", 10);
		request.put("hotels.check_in_at", "2021-08-25");
		request.put("hotels.night_count", 10);
		request.put("hotels.country_id", 1);
		request.put("hotels.city_id", 10);
		request.put("hotels.area_id", 1);
		request.put("hotels.is_include_sightseeing", 1);
		request.put("hotels.product_hotel_type_id", 1);
		request.put("hotels.note.ar", " ” ");
		request.put("hotels.note.en", "test");

		request.put("hotels.sort", 1);
		request.put("hotels.price_extra_bed", 1);
		request.put("hotels.price_child", 100);
		request.put("hotels.price_infant", 100);

		request.put("hotels.rooms.room_type_id", 1);
		request.put("hotels.rooms.price_adult", 100);
		request.put("hotels.rooms.count", 100);
		
		request.put("hotels.rooms.room_type_id", 2);
		request.put("hotels.rooms.price_adult", 100);
		request.put("hotels.rooms.count", 500);
		
		
		request.put("hotels.meals.meal_type_id", 1);
		request.put("hotels.meals.meal_type_id", 2);
		request.put("hotels.meals.meal_type_id", 3);
		
		request.put("external_transportations.count", 100);
		request.put("external_transportations.transporter_id", 100);
		request.put("external_transportations.transportation_type_id", 1);
		request.put("external_transportations.destination_type_id", 1);
		request.put("external_transportations.to_country_id", 1);
		request.put("external_transportations.to_port_id", 1);
		request.put("external_transportations.to_hall_id", 1);
		request.put("external_transportations.from_country_id", 100);
		request.put("external_transportations.from_port_id", 2);
		request.put("external_transportations.from_hall_id", 2);
		request.put("external_transportations.trip_number", "TRIP_EG_100");
		request.put("external_transportations.departure_at", "2022-11-01");
		request.put("external_transportations.arrival_at", "2023-11-02");
		request.put("external_transportations.note.ar", "yyyy");
		request.put("external_transportations.note.en", "yyyy");

		request.put("external_transportations.sort", 1);
		request.put("external_transportations.price_adult", 100);
		request.put("external_transportations.price_child", 100);
		request.put("external_transportations.price_infant", 100);
		
		request.put("external_transportations.transits.transporter_id", 2);
		request.put("external_transportations.transits.country_id", 9);
		request.put("external_transportations.transits.city_id", 3);
		request.put("external_transportations.transits.arrival_port_id", 2);
		request.put("external_transportations.transits.departure_port_id", 2);
		request.put("external_transportations.transits.departure_at", "2022-11-01");
		request.put("external_transportations.transits.arrival_at", "2023-11-02");

		request.put("internal_transportations.transportation_type_id", 2);
		request.put("internal_transportations.transportation_cycle_type_id", 1);
		request.put("internal_transportations.transporter_name.ar", " ” ");
		request.put("internal_transportations.transporter_name.en", "test");

		request.put("internal_transportations.price_adult", 2000);
		request.put("internal_transportations.price_child", 2500);
		request.put("internal_transportations.price_infant", 1500);
		request.put("internal_transportations.note.ar", "eeee");
		request.put("internal_transportations.note.en", "vvv");

		request.put("internal_transportations.sort", "5");
		request.put("internal_transportations.bus.bus_id", "2");
		request.put("internal_transportations.bus.bus_count", 100);
		request.put("internal_transportations.bus.seats_count", 60);

		request.put("domestics.transporter_id", 1);
		request.put("domestics.destination_type_id", 3);
		request.put("domestics.country_id", 1);
		request.put("domestics.to_port_id", 1);
		request.put("domestics.to_hall_id", 1);
		request.put("domestics.from_port_id", 2);
		request.put("domestics.from_hall_id", 2);
		request.put("domestics.trip_number", "TRIP_EG_100");
		request.put("domestics.departure_at", "2021-10-01");
		request.put("domestics.arrival_at", "2022-11-02");
		request.put("domestics.note.ar", "tttt");
		request.put("domestics.note.en", "zzzz");

		request.put("domestics.sort", 3);
		request.put("domestics.price_adult", 100);
		request.put("domestics.price_child", 100);
		request.put("domestics.price_infant", 100);
		
		request.put("other_services.name.ar", " ” ");
		request.put("other_services.name.en", "test");
		request.put("other_services.sort", 3);
		request.put("other_services.price_adult", 100);
		request.put("other_services.price_child", 100);
		request.put("other_services.price_infant", 100);
		
		request.put("other_services.name.ar", " ” ");
		request.put("other_services.name.en", "test");
		request.put("other_services.sort", 5);
		request.put("other_services.price_adult", 100);
		request.put("other_services.price_child", 100);
		request.put("other_services.price_infant", 100);
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().header("content-type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(request.toJSONString()).when().post("https://trip.gw.safav2.io.safavisa.com/products").then().statusCode(422);
	}
	
}
