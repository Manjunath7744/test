import java.util.HashMap;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Script1 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		  JSONObject obj = new JSONObject();
		  obj.put("name", "morpheus");
		  obj.put("job", "leader");
		  r.contentType(ContentType.JSON);
		  r.body(obj.toJSONString());
		  Response res = r.request(Method.POST,"/api/users?page=2");
		  System.out.println(res.asString());
		  int code = res.statusCode();
		  System.out.println(code);
		   
	}

}

