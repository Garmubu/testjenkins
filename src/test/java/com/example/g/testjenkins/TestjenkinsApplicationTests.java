package com.example.g.testjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestjenkinsApplicationTests{

	@Test
	void testReussi() {
		//d
		assertEquals(5,5);
	}
	@Test
	void testFoire() {
		//d
		assertEquals(5,6);
	}

}
