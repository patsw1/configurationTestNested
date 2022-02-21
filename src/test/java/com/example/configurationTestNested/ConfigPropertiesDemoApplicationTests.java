package com.example.configurationTestNested;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = ConfigPropertiesDemoApplication.class)
class ConfigPropertiesDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private JsonProperties jsonProperties;

	@Test
	public void whenPropertiesLoadedViaJsonPropertySource_thenLoadFlatValues() {
		System.out.println(jsonProperties);
		assertEquals("mailer@mail.com", jsonProperties.getHost());
		assertEquals(9090, jsonProperties.getPort());
		assertTrue(jsonProperties.isResend());
		String[] symbols = jsonProperties.getSymbols();
		assertTrue(symbols[0].equals("a"));
		System.out.println("sender="+jsonProperties.getSender());
		
	}
}
