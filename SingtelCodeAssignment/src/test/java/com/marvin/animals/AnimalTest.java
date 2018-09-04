package com.marvin.animals;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.marvin.actions.ActionsInterf;
import com.marvin.actions.Talk_Chicken;
import com.marvin.constants.ActionEnum;

public class AnimalTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_GetAction() {
		Animal animal = new Animal();
		animal.addAction(ActionEnum.TALK, new Talk_Chicken());
		
		ActionsInterf action = animal.getAction(ActionEnum.TALK);
		assertTrue(action instanceof Talk_Chicken);
	}
}
