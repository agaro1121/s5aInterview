package com.s5a.interview;

public class ProductController {

	//product not set to private
	//Maybe consider instantiating product in constructor
    Product product = ServiceProduct.add("Saks-brand-name"); // <-- add() used statically but not below

    //Method will not be available outside of this class
    private String showProduct() {
        product.getBrandName() //Requires semicolon
        //no return statement
    }

    public boolean addProduct(String brandName) {
        product = serviceProduct.add(brandName); // <-- add() not used statically like above
        										//No instance of 'serviceProduct' available
        //always returns true. What if product == null ? Requires validation
        return true;
    }

    //If this were MVC pattern, then below method should maybe return a string to accommodate different 
    // Front Ends
    public static void formatedBrandName() {
        										//not proper method call. product.getBrandName()
    	System.out.println("Current product: " + product.getBrandName)//Requires semicolon
    	
    }

}