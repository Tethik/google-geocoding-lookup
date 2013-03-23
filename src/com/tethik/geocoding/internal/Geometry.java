package com.tethik.geocoding.internal;

import org.json.JSONException;
import org.json.JSONMappedObject;
import org.json.JSONObj;
import org.json.JSONObject;

public class Geometry extends JSONMappedObject {
	
	@JSONObj
	protected LocationType location_type;
	@JSONObj
	protected Location location;
	@JSONObj
	protected Viewport viewport;

	
	public Geometry(JSONObject obj) throws JSONException  {
		super(obj);
	}

	/**
	 * @return the location_type
	 */
	public LocationType getLocation_type() {
		return location_type;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @return the viewport
	 */
	public Viewport getViewport() {
		return viewport;
	}
}
