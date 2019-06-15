package com.qa.rest.tests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutAPICall {
	
	@Test
	public void postTest() {
	
	RequestSpecification request = RestAssured.given();
	
	request.header("Content-Type","application/json");
	
	JSONObject jsonObj = new JSONObject();
	jsonObj.put("name", "morpheus");
	jsonObj.put("job", "zion resident");
	
	request.body(jsonObj.toJSONString());
	
	Response response = request.put("https://reqres.in/api/users/2");
	
	int code = response.getStatusCode();
	System.out.println("response code-->"+code);
	Assert.assertEquals(code, 200);
	
	}

}
