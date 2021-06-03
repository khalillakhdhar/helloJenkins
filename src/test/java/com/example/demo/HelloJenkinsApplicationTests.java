package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloJenkinsApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testone()
	{
		assertEquals(0, 1);
		
	}

}
