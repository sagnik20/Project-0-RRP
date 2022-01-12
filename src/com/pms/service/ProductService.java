package com.pms.service;

import com.pms.modal.Product;

public interface ProductService {
	public void addProduct(Product p);
	public void remove(Integer id);
	public void update(Integer id,String newname);
	public void update(Integer id,Double qty);
	public void update(Integer id,Double qty,int i);
	public void display();
}
