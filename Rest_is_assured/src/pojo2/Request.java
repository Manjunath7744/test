package pojo2;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Request 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI    = "https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res           = r.request(Method.GET,"/api/users/2");
		Single_user s 	       = res.as(Single_user.class);
		Data d 			       = s.getData();
		String first_name      = d.getFirst_name();
		String email 	       = d.getEmail();
		System.out.println(first_name);
		System.out.println(email);
		
		
	}

}
