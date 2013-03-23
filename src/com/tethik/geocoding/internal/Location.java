package com.tethik.geocoding.internal;

import org.json.JSONException;
import org.json.JSONMappedObject;
import org.json.JSONObj;
import org.json.JSONObject;

public class Location extends JSONMappedObject {
	public Location(JSONObject obj) throws JSONException
	{
		super(obj);
	}
	
	@JSONObj
	public double lng;
	
	@JSONObj
	public double lat;
}