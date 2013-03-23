package com.tethik.geocoding.internal.tests;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.junit.Test;

import com.tethik.geocoding.internal.AddressComponent;

public class AddressComponentTest extends JSONTest {

	@Test
	public void testAddressComponent() {
		try {
			AddressComponent ac = new AddressComponent(obj);
			assertTrue(ac.getLong_name().equals("Santa Clara"));
			assertTrue(ac.getShort_name().equals("Santa Clara"));
			assertArrayEquals(ac.getTypes(), new String[]{"administrative_area_level_2", "political"});			
		} catch (JSONException e) {			
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	
	}

}
