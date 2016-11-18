package com.testMaven.one.TestMavenOne;

import org.testng.annotations.*;

public class PracticeTwo01TestNG {

	@Parameters({"TestData"})
	@Test
	public void test(@Optional("aaa") String testdata){
		System.out.println(System.getProperty("user.dir")+testdata);

	}
}
