package com.tethik.geocoding.internal;

import org.json.JSONException;
import org.json.JSONMappedObject;
import org.json.JSONObj;
import org.json.JSONObject;

public class AddressComponent extends JSONMappedObject {
	
	@JSONObj
	protected String long_name;
	
	@JSONObj
	protected String short_name;
	
	@JSONObj
	protected String[] types;
	
	/**
	 * @return the long_name
	 */
	public String getLong_name() {
		return long_name;
	}

	/**
	 * @return the short_name
	 */
	public String getShort_name() {
		return short_name;
	}

	/**
	 * @return the types
	 */
	public String[] getTypes() {
		return types;
	}

	public AddressComponent(JSONObject obj) throws JSONException
	{
		super(obj);		
	}		
}
