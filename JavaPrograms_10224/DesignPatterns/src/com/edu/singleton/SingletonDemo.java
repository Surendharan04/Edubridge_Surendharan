package com.edu.singleton;
//Singleton is used to create only one object
class Product{
	private static Product pob;		//This will initialize the product object
	private Product() {}			//This will make the object to create only once
	public static Product getProductObject() {
		if (pob == null) {
			pob = new Product();	//Create object if it is not created before
			return pob;
		}
		else {
			return pob;
		}
	}
	
	public void displayProduct() {
		System.out.println("Display all products");
	}
	
	public void productCreation() {
		System.out.println("Product created");
	}
}

public class SingletonDemo {
	public static void main(String[] args) {
		Product pob = Product.getProductObject();
		pob.displayProduct();
		
		Product pob1 = Product.getProductObject();	//The 'pob1' is also the same object of Product
		pob1.productCreation();
	}
}
