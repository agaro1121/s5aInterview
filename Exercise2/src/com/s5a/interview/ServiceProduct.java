package com.s5a.interview;

import java.util.ArrayList;
import java.util.List;

import com.sample.dao.UserDao;
import com.sample.dao.UserDaoImpl;

public class ServiceProduct {
	private UserDao userDao = null;
	private static List<Product> listOfProducts = null;

	public ServiceProduct(){
		userDao = new UserDaoImpl();
		listOfProducts = new ArrayList<Product>();
	}
	
	public Product add(String string) throws Exception {
		if( string == null || string.equals("") || string.length() == 0)
			throw new Exception("Product Name is null or empty"); 
		boolean isAdded = userDao.add(string);
		Product product = null;

		if(isAdded){
			product = new Product(string);
			listOfProducts.add(product);
		}
		return product;
	}

	public String showProducts(){
		StringBuilder listOfProductsString = new StringBuilder();
		if(listOfProducts.size() > 0){
			for (Product product : listOfProducts) {
				listOfProductsString.append(product.getBrandName() + ",");
			}
			listOfProductsString.deleteCharAt(listOfProductsString.length()-1);
			return listOfProductsString.toString();
		}
		return "No Products Added yet";
	}

	public List<Product> getListOfProducts() {
		return listOfProducts;
	}
}
