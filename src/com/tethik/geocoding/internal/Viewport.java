package com.tethik.geocoding.internal;

import org.json.JSONException;
import org.json.JSONMappedObject;
import org.json.JSONObj;
import org.json.JSONObject;

public class Viewport extends JSONMappedObject {				
	public Viewport(JSONObject obj) throws JSONException {
		super(obj);
	}
	
	@JSONObj
	public Location northeast;
	@JSONObj
	public Location southwest;
}