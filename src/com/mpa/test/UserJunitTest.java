package com.mpa.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mpa.domain.User;
import com.mpa.service.UserServiceImpl;

public class UserJunitTest {

	private static User user;
	static UserServiceImpl userimpl;

	@BeforeClass
	public static void oneTimeSetUp() {
		user = new User();
		userimpl = new UserServiceImpl();
		user.setName("testuser1");
		user.setPassword("password1");
	}

	@Before
	public void setUp() throws Exception {
		// TO DO
	}

	@Test
	public void testUserNameEmpty() {
		user.setName("James");
		assertFalse("User name cannot be empty : ", user.getName().isEmpty());
	}

	@Test
	public void testNameLength() {
		int n = user.getName().length();
		assertFalse("User name must be more than 8 char.", n < 8);
	}

	@Test
	public void testPasswordLength() {
		int n = user.getPassword().length();
		assertFalse("Password must be more than 8 char.", n < 8);
	}

	@Test
	public void testUserLimit() {
		assertTrue("User registration exceeds limit : ", 5 > userimpl.add(user));
	}
	
	@After
	public void tearDown() throws Exception {
		// TO DO
	}
	
	@AfterClass
    public static void oneTimeTearDown() {
		user = null;
		userimpl = null;
    }
}
