package com.arjun.cicd.example.cicdpipeline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CicdPipelineApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void TestDemo(){
		String actual = "Actual test";
		String expected = "Actual test";
		assertEquals(actual,expected);

	}
	@Test
	public void TestDemo1(){
		String actual = "Actual test";
		String expected = "Actual test";
		assertEquals(actual,expected);

	}

}
