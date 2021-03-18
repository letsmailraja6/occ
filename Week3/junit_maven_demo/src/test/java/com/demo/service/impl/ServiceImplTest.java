package com.demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.demo.service.Service;

class ServiceImplTest {

	private static Service service;

	@BeforeAll
	public static void setUpService()
	{
		service=new ServiceImpl();
	}

	@Test
	void testIsValidPrimeNumberForNegative() {
		assertEquals(false, service.isValidPrimeNumber(-1));
	}
	
	@Test
	void testIsValidPrimeNumberForPrimeNumber() {
		//assertEquals(true, service.isValidPrimeNumber(5));
		assertTrue(service.isValidPrimeNumber(5));
	}
	
	@Test
	void testIsValidPrimeNumberForNonPrimeNumber() {
		//assertEquals(true, service.isValidPrimeNumber(5));
		assertFalse(service.isValidPrimeNumber(6));
	}

	@Test
	void testIsValidMobileNumberForNull() {
		assertEquals(false, service.isValidMobileNumber(null));
	}
	
	@Test
	void testIsValidMobileNumberForInvalidNumber() {
		assertEquals(false, service.isValidMobileNumber("sdffgfdg"));
	}
	
	@Test
	void testIsValidMobileNumberForValidNumber() {
		assertEquals(true, service.isValidMobileNumber("+1-1234567890"));
	}

}
