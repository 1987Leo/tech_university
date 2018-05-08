package com.datio.academy.exercise1;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

	@Test
	public void sayHelloTest() {
		Calc c = new Calc();
		Assert.assertEquals(42, c.add(40, 2));
	}
}
