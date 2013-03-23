package com.tethik.geocoding.internal.tests;

import java.io.File;
import java.io.FileInputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public abstract class JSONTest {

	protected JSONObject obj;
	private FileInputStream in;
	
	
	protected String getFilename()
	{
		String cname = this.getClass().getName();
		cname = cname.substring(cname.lastIndexOf(".")+1);
		return "tests/"+cname+".json";
	}
	
	@Before
	public void setUp() throws Exception {
		in = new FileInputStream(getFilename());
		obj = new JSONObject(new JSONTokener(in));
	}


	@After
	public void tearDown() throws Exception {
		in.close();
	}

	@Test
	public void testJSONFileExists() {
		assert(new File(getFilename()).exists());
	}

}
