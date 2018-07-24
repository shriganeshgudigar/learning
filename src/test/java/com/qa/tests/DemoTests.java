package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTests {
	
	@Test
	public void sum(){
		int a=10;
		int b= 20;
		Assert.assertEquals(30, a+b);		
	}
}
