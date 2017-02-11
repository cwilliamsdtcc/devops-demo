package com.carloswilliams.demos.devops;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	private static final String EXPECTED_LAST_NAME = "Last";
	private static final String EXPECTED_FIRST_NAME = "First";

	private Person person;
	
	@Before
	public void setUp() throws Exception {
		person = new Person(EXPECTED_FIRST_NAME, EXPECTED_LAST_NAME);
	}

	@Test
	public void testPerson() {
		assertEquals(EXPECTED_FIRST_NAME, person.firstName);
		assertEquals(EXPECTED_LAST_NAME, person.lastName);
	}

	@Test
	public void testGetFirstName() {
		assertEquals(EXPECTED_FIRST_NAME, person.firstName);
	}

	@Test
	public void testGetLastName() {
		assertEquals(EXPECTED_LAST_NAME, person.lastName);
	}

}
