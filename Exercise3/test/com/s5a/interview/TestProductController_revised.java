package com.s5a.interview;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestProductController_revised {
	ProductController_revised productController = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		productController = new ProductController_revised();
	}

	@Test
	public void testNullEntry(){
		boolean isValid = productController.addProduct(null);
		assertEquals(false, isValid);
	}

}
