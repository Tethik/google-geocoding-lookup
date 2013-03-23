package com.tethik.geocoding.internal.tests;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.junit.Test;

import com.tethik.geocoding.internal.Request;
import com.tethik.geocoding.internal.Result;
import com.tethik.geocoding.internal.LocationType;


public class ResultTest extends JSONTest {

	@Test
	public void testGoogleGeocodingResult() {
		try {
			Result result = new Result(obj);
			assertTrue(result.getAddress_components()[0].getLong_name().equals("1600"));
			assertTrue(result.getAddress_components().length == 7);
			assertTrue(result.getFormatted_address().equals("1600 Amphitheatre Parkway, Mountain View, CA 94043, USA"));
			assertTrue(result.getGeometry().getLocation_type() == LocationType.ROOFTOP);
		} catch (JSONException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
