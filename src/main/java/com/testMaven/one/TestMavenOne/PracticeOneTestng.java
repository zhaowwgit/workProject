package com.testMaven.one.TestMavenOne;

import org.testng.annotations.*;

public class PracticeOneTestng {
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void test1(){
		System.out.println("test1");
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest");
	}
}
