package ru.md.env;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import ru.md.env_base.BaseClass;

public class EnvTest {

	private static Env env;

	@BeforeClass
	public static void init() {
		env = new Env();
	}

	@Test
	public void fooTest() {
		BaseClass baseClass = env.getBaseClass();
		String actual = baseClass.foo();
		Assert.assertEquals("I'm foo!", actual);
	}

}
