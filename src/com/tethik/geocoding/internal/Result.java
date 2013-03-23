package com.tethik.geocoding.internal;

import org.json.JSONException;
import org.json.JSONMappedObject;
import org.json.JSONObj;
import org.json.JSONObject;

public class Result extends JSONMappedObject {
	
	public Result(JSONObject obj) throws JSONException {
		super(obj);
	}

	@JSONObj
	protected String formatted_address;	
	@JSONObj
	protected AddressComponent[] address_components;
	@JSONObj
	protected Geometry geometry;
	@JSONObj
	protected String[] types;
	
	/**
	 * @return the formatted_address
	 */
	public String getFormatted_address() {
		return formatted_address;
	}
	/**
	 * @return the address_components
	 */
	public AddressComponent[] getAddress_components() {
		return address_components;
	}
	/**
	 * @return the geometry
	 */
	public Geometry getGeometry() {
		return geometry;
	}
	/**
	 * @return the types
	 */
	public String[] getTypes() {
		return types;
	}
}
