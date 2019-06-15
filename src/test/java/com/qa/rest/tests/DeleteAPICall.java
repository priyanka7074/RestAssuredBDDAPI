package com.qa.rest.tests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteAPICall {
	
	@Test
	public void deleteTest() {
	
	RequestSpecification request = RestAssured.given();
	
	Response response = request.delete("https://reqres.in/api/users/2");
	
	int code = response.getStatusCode();
	Assert.assertEquals(code, 204);
	
	}

}
