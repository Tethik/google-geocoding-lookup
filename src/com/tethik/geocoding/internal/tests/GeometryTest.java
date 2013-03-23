package com.tethik.geocoding.internal.tests;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import com.tethik.geocoding.internal.Geometry;
import com.tethik.geocoding.internal.LocationType;

public class GeometryTest extends JSONTest {
	
	
	@Test
	public void testGoogleGeocodingGeometry() {
		try {
			Geometry geo = new Geometry(obj);
			
			//System.out.println(geo.getLocation().latitude);
			
			assert(geo.getLocation_type() == LocationType.ROOFTOP);
			assert(geo.getLocation().lat == 37.42164080D);
			assert(geo.getViewport().southwest.lat == 37.42029181970850);
			// Add more?
			
		} catch(JSONException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}
	
	
	

}
