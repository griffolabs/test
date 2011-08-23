package ru.md.env_base;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

public class BaseClassTest {

	private static BaseClass baseClass;
	
	@BeforeClass
	public static void init(){
		baseClass = new BaseClass();
	}
	
	@Test
	public void fooTest(){
		String actual = baseClass.foo();
		Assert.assertEquals("I'm foo!", actual);
	}
	
}
