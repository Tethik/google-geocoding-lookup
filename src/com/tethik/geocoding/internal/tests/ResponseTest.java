package com.tethik.geocoding.internal.tests;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.junit.Test;

import com.tethik.geocoding.internal.Response;
import com.tethik.geocoding.internal.Response.StatusCode;

public class ResponseTest extends JSONTest {

	@Test
	public void testGoogleGeocodingResponseJSONObject() {
		try {
			Response response = new Response(obj);
			assertTrue(response.getStatus().equals(StatusCode.OK));
			assertTrue(response.getResults().length == 1);
		} catch (JSONException e) {			
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
