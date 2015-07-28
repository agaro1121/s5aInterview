package com.s5a.interview;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ServiceProductTest {
	private ServiceProduct serviceProduct = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		serviceProduct = new ServiceProduct();
	}

	@Test
	public void testServiceProductInstance(){
		assertNotNull(serviceProduct);
	}
	
	@Test
	public void testServiceProductShowEmptyList(){
		assertEquals("No Products Added yet",serviceProduct.showProducts());
	}
	
	@Test
	public void testEmptyList(){
		assertEquals(0,serviceProduct.getListOfProducts().size());
	}
	
	@Test
	public void testOneEntryAddedToList() throws Exception{
		serviceProduct.add("ItemOne");
		assertEquals(1, serviceProduct.getListOfProducts().size());
	}
	
	@Test
	public void testMultipleEntriesFromDiffSources() throws Exception{
		ServiceProduct serviceProduct2 = new ServiceProduct();
		serviceProduct.add("ItemOne");
		serviceProduct2.add("ItemTwoFromSource2");
		assertEquals(2, serviceProduct.getListOfProducts().size());
		assertEquals(2, serviceProduct2.getListOfProducts().size());
	}

	@Test
	public void testShowProductsNonEmptyList() throws Exception{
		ServiceProduct serviceProduct2 = new ServiceProduct();
		serviceProduct.add("ItemOne");
		serviceProduct2.add("ItemTwoFromSource2");
		assertEquals("ItemOne,ItemTwoFromSource2",serviceProduct.showProducts());
		assertEquals("ItemOne,ItemTwoFromSource2",serviceProduct2.showProducts());
	}
	
	@Test(expected = Exception.class)
	public void testNullInput() throws Exception{
		serviceProduct.add(null);
	}
	
	@Test(expected = Exception.class)
	public void testEmptyInput() throws Exception{
		serviceProduct.add("");
	}
	
}
