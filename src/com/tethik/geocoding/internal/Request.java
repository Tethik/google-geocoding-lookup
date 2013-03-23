package com.tethik.geocoding.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.net.URL;

import org.json.JSONException;

public class Request {
	
	protected static String URL = "http://maps.googleapis.com/maps/api/geocode/json?";
	
	private String address;
	private String region = null;
	private String bounds = null;
	private boolean sensor = false;
	private String language = null;
	
	public Request(String address)
	{
		this(address, "");		
	}
	
	/**
	 * @return the uRL
	 */
	public static String getURL() {
		return URL;
	}

	/**
	 * @param uRL the uRL to set
	 */
	public static void setURL(String uRL) {
		URL = uRL;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	
	/**
	 * @return the bounds
	 */
	public String getBounds() {
		return bounds;
	}

	/**
	 * @param bounds the bounds to set
	 */
	public void setBounds(String bounds) {
		this.bounds = bounds;
	}

	/**
	 * @return the sensor
	 */
	public boolean isSensor() {
		return sensor;
	}

	/**
	 * @param sensor the sensor to set
	 */
	public void setSensor(boolean sensor) {
		this.sensor = sensor;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	public Request(String address, String region)
	{
		this.address = address;
		this.region = region;
	}
	
	protected String urlEncode(String toEncode)
	{
		try {
			return URLEncoder.encode(toEncode, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public String getRequestUrl() throws UnsupportedEncodingException
	{
		StringBuilder builder = new StringBuilder();
		builder.append(URL);
		builder.append("address=").append(this.address);
		
		String[] opt_args =  { "region", "bounds", "language",  "sensor" };
		Object[] opt_vals = { region, bounds, language, sensor};
		
		for(int i = 0; i < opt_args.length; i++)
			if(opt_vals[i] != null && opt_vals[i] != "")
				builder.append("&").append(opt_args[i]).append("=").append(urlEncode(opt_vals[i].toString()));				
				
		return builder.toString();
	}
	
	public Response doRequest() throws MalformedURLException, UnsupportedEncodingException, IOException, JSONException
	{
		HttpURLConnection con = (HttpURLConnection) (new URL(getRequestUrl())).openConnection();		
		return new Response(con.getInputStream());		
	}
	
}
