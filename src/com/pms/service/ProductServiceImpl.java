package com.pms.service;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Scanner;

import com.pms.modal.Product;

public class ProductServiceImpl implements ProductService{
	
	static ArrayList<Product> productList = new ArrayList<Product>();
	
	public void addProduct(Product p) {
		productList.add(p);
		System.out.println(productList);
	}
	
	public void remove(Integer id) {
		Iterator<Product> it=productList.iterator();
		while(it.hasNext()) {
			Product p= (Product)it.next();
			if(p.getProductId() == id) {
				System.out.println(p.getProductName() + " is Deleted.");
				it.remove();
			}
		}
	}
	public void update(Integer id,String newName) {
		Iterator<Product> it=productList.iterator();
		while(it.hasNext()) {
			Product p= (Product)it.next();
			if(p.getProductId() == id) {
				System.out.println("Old Product Name "+ p.getProductName()+" is changed to "+newName+" .");
				p.setProductName(newName);
			}
		}
		
	}
	public void display() {
		for(Product p : productList) {
			System.out.println("Id: "+p.getProductId());
			System.out.println("Name: "+p.getProductName());
			System.out.println("Quantity: "+p.getQuantity());
			System.out.println("Price: "+ p.getPrice());
			
			System.out.println("\n");
		}
		
		
	}

	@Override
	public void update(Integer id, Double qty) {
		Iterator<Product> it=productList.iterator();
		while(it.hasNext()) {
			Product p= (Product)it.next();
			if(p.getProductId() == id) {
				System.out.println("Old Product Name "+ p.getQuantity()+" is changed to "+qty+" .");
				p.setQuantity(qty);
			}
		}
		
	}

	@Override
	public void update(Integer id, Double pri, int i) {
		Iterator<Product> it=productList.iterator();
		while(it.hasNext()) {
			Product p= (Product)it.next();
			if(p.getProductId() == id) {
				System.out.println("Old Product Name "+ p.getPrice()+" is changed to "+pri+" .");
				p.setPrice(pri);
			}
		}
		
	}


}
