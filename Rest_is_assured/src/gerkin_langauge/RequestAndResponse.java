package gerkin_langauge;
import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification; 
public class RequestAndResponse 
{
	static RequestSpecification request()
	{
		RequestSpecBuilder req = new RequestSpecBuilder();
		RequestSpecification request = req.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
				return request;
	}
	static ResponseSpecification response()
	{
		 ResponseSpecBuilder res = new ResponseSpecBuilder();
		 ResponseSpecification response = res.expectStatusCode(200).expectContentType(ContentType.JSON).build();
		 return response;
	}
	public static void main(String[] args)
	{
		Response ressss = given().spec(request()).when().get("/api/users?page=2").then().spec(response()).extract().response();
		ressss.prettyPrint();
		
	}

}
