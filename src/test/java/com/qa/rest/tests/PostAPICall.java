package com.qa.rest.tests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PostAPICall {
	
	@Test
	public void postTest() {
	
	RequestSpecification request = RestAssured.given();
	
	request.header("Content-Type","application/json");
	
	JSONObject jsonObj = new JSONObject();
	jsonObj.put("name", "morpheus");
	jsonObj.put("job", "leader");
	
	request.body(jsonObj.toJSONString());
	
	Response response = request.post("https://reqres.in/api/users");
	
	int code = response.getStatusCode();
	Assert.assertEquals(code, 201);
	
	}

}
