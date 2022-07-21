package restAs;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class Ex1 {
	public static void main(String[] args) {
		String url = "https://reqres.in/";
		RestAssured.baseURI = url;
		String payload = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		String res = "https://reqres.in/api/users";
		given().body(payload)
		.when().post(res)
		.then().log().all();
		for(int a= 0;a<=50;a++)
		{
			String re = "api/users/"+a;
			given()
			.when().get(re)
			.then().log().all();
		}
	}	
}
