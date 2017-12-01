package org.vallinti;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HelloWorldControllerTest {

	@Test
	public void testController() throws Exception {
		HelloWorldController toTest = new HelloWorldController();
		assertEquals("hello world", toTest.hello());
		
	}
	
}
