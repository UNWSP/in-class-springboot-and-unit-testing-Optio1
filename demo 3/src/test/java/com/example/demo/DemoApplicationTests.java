package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testGetContent() {
		Greeting greeting = new Greeting(1,"Test");
		assertEquals("Test", greeting.getContent());
	}

}
