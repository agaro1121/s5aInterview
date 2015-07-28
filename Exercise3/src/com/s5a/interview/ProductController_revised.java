package com.s5a.interview;

public class ProductController_revised{
    private Product product = null;
    private ServiceProduct serviceProduct = null;
    
    public ProductController_revised() throws Exception{
    	serviceProduct = new ServiceProduct();
    	product = serviceProduct.add("Saks-brand-name");
    }
    
    public String showProduct() {
        return product.getBrandName();
    }

    public boolean addProduct(String brandName) {
    	boolean isValidProduct = true;
        try {
			product = serviceProduct.add(brandName);
		} catch (Exception e) {
			System.out.println("Error: " +e.getMessage());//would normally be a log statement
			isValidProduct = false;
		}
		return isValidProduct;
    }

    public String formatedBrandName() {
        return "Current product: " + product.getBrandName();
    }

}