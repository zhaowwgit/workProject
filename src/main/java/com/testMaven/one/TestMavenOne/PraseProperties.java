package com.testMaven.one.TestMavenOne;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.openqa.jetty.html.Input;

public class PraseProperties {
	private Properties pro = new Properties();
	String value = null;
	
	public PraseProperties(String propertiesPath){
		this.loadPrpertiese(propertiesPath);
	}

	private void loadPrpertiese(String propertiesPath) {
		try{
			InputStream in = new FileInputStream(propertiesPath);
			InputStreamReader inr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(inr);
			pro.load(br);
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
	
	public String getValue(String keyname){
		value = pro.getProperty(keyname).trim();
		try {
			value = new String(value.getBytes("UTF-8"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static void main(String[] args){
		PraseProperties pp = new PraseProperties(System.getProperty("user.dir")+"\\tools\\test1.properties");
		System.out.println(pp.getValue("url"));
	}
	
}
