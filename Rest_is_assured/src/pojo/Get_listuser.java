package pojo;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_listuser 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI    = "https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res           = r.request(Method.GET,"/api/users?page=2");
		List_user list = res.as(List_user.class);
		List<Data> d = list.getData();
		System.out.println(d);
		for(Data o:d)
		{
			String avatar = o.getEmail();
			System.out.println(avatar);
		}
		
	}

}
