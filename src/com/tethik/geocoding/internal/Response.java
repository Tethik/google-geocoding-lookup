package com.tethik.geocoding.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.json.*;

public class Response extends JSONMappedObject {
	
	public enum StatusCode {
		OK,
		ZERO_RESULTS,
		OVER_QUERY_LIMIT,
		REQUEST_DENIED,
		INVALID_REQUEST,
		UNKNOWN_ERROR
	}	

	private InputStream stream;
	
	@JSONObj
	protected StatusCode status;
	
	@JSONObj
	protected Result[] results;	

	public Response(InputStream stream) throws JSONException
	{
		this(new JSONObject(new JSONTokener(stream)));
	}
	
	public Response(JSONObject obj) throws JSONException {
		super(obj);
	}
	
	/**
	 * @return the status
	 */
	public StatusCode getStatus() {
		return status;
	}

	/**
	 * @return the results
	 */
	public Result[] getResults() {
		return results;
	}
}
