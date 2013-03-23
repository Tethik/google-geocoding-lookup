package com.tethik.geocoding;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import org.json.JSONException;

import com.tethik.geocoding.internal.Request;
import com.tethik.geocoding.internal.Response;
import com.tethik.geocoding.internal.Result;

public class Lookup {
	
	private String address;
	
	public Lookup(String address) {
		this.address = address;
	}
	
	public Response doRequest() throws MalformedURLException, UnsupportedEncodingException, IOException, JSONException
	{
		Request request = new Request(this.address);
		System.out.println("Sending request to: " + request.getRequestUrl());
		return request.doRequest();
	}
	
	public static void main(String[] args)
	{
		if(args.length < 1)
		{
			System.out.println("Usage: Lookup <address>");
			return;
		}
		
		Lookup lookup = new Lookup(args[0]);
		try {
			Response response = lookup.doRequest();
			System.out.println("Status: " + response.getStatus());
			
			int i = 1;
			for(Result result : response.getResults())
			{
				System.out.println("#"+i++ + " " + result.getFormatted_address());
				System.out.println("Lng "+result.getGeometry().getLocation().lng);
				System.out.println("Lat "+result.getGeometry().getLocation().lat);
				System.out.println();
			
			}
			
		} catch (IOException | JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
