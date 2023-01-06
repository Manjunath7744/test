package gerkin_langauge;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Script01 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI = "https://reqres.in/";
		given().
		when().
		get("/api/users/2").
		then().
		statusCode(200).
		and().
		contentType(ContentType.JSON);
		System.out.println("done");
	}

}
