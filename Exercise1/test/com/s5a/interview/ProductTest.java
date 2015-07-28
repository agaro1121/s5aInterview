/**
 * 
 */
package com.s5a.interview;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Anthony Garo
 *
 */
public class ProductTest {
	private Product product = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		product = new Product("TEST");
	}
	
	/**
	 * Tests if an instance of the object can be created
	 */
	@Test
	public void testInstance(){
		assertNotNull(product);
	}
	
	/**
	 * Tests if the object returns the correct Brand Name
	 */
	
	@Test
	public void testGetBrandNameEquals(){
		assertEquals("TEST", product.getBrandName());
	}
	
	/**
	 * Tests if the object returns incorrect Brand Name
	 */
	@Test
	public void testGetBrandNameNotEquals(){
		assertNotEquals("NOT_EQUAL", product.getBrandName());
	}
	
	@Test
	public void testGetBrandNameEmptyString(){
		product = new Product("");
		assertEquals("", product.getBrandName());
	}
	
	@Test
	public void testGetBrandNameNUllString(){
		product = new Product(null);
		assertEquals(null, product.getBrandName());
	}

}
