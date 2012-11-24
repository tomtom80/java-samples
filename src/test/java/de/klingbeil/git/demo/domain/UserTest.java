package de.klingbeil.git.demo.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Before;

import org.junit.Test;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
	user = new User();
    }

    @Test
    public void testId() {
	Long expectedId = Long.valueOf(134);

	user.setId(expectedId);

	assertSame(expectedId, user.getId());
    }

    @Test
    public void testName() throws Exception {
	String expectedName = "golum";
	
	user.setName( expectedName);
	
	assertEquals( expectedName, user.getName());
    }

}
