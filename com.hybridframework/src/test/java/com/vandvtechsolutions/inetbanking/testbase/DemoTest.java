package com.vandvtechsolutions.inetbanking.testbase;

import org.testng.annotations.Test;

public class DemoTest extends TestBase {

	@Test
	public void test()
	
	{
		System.out.println("Demo Test");
		
		System.out.println(driver.getTitle());
	}
	
	
	
}
