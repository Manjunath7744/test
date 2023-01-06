package pojo3;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCreate {
	public static void main(String[] args) {
		RestAssured.baseURI    = "https://reqres.in/";
	    Response resp = RestAssured.given().request(Method.POST,"/api/users");
	    JSONObject obj = new JSONObject();
		obj.put("name", "morpheus");
		obj.put("", "leader");
	    Create c = resp.as(Create.class);
	   
		
		
	
	}

}
