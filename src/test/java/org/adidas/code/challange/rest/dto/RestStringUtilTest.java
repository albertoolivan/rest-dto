package org.adidas.code.challange.rest.dto;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Unit test for simple RestStringUtil.
 */
public class RestStringUtilTest {
	
	@Test
	public void stack2stringTest() {
		// prepare
		String test1 = "Test exception";
		Exception exception = new Exception(test1);
		// test
		String check1 = RestStringUtil.stack2string(exception);
		System.out.println("Test - stack2string (1): '" + test1 + "' -> " + check1);
		assertTrue(check1.contains(test1));
	}

}
