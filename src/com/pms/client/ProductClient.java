package com.pms.client;

import java.util.Scanner;

import com.pms.modal.Product;
import com.pms.service.ProductService;
import com.pms.service.ProductServiceImpl;

public class ProductClient {

	public static void main(String[] args) {
		ProductService ps = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println(" =====Menu=====");
			System.out.println(" 1. Add Product");
			System.out.println(" 2. Remove Product");
			System.out.println(" 3. Update Product Details");
			System.out.println(" 4. Show Products Available");
			System.out.println("Press anything else to exit.");
			
			Integer ch = sc.nextInt();
			switch(ch) {
			case 1:
				Product p = new Product();
				System.out.println("Enter New Product ID");
				p.setProductId(sc.nextInt()); sc.nextLine();
				System.out.println("Enter New Product Name");
				p.setProductName(sc.nextLine());
				System.out.println("Enter New Product Price");
				p.setPrice(sc.nextDouble());
				System.out.println("Enter New Product Quantity");
				p.setQuantity(sc.nextDouble());
				ps.addProduct(p);
				break;
			case 2:
				System.out.println("Enter the Product Id you want to Delete");
				Integer id = sc.nextInt();
				ps.remove(id);
				break;
			case 3:
				System.out.println("Enter the Product Id you want to Update");
				Integer id1 = sc.nextInt();
				System.out.println("What do you want to modify?");
				System.out.println("1. Product Name");
				System.out.println("2. Product Quantity");
				System.out.println("3. Product Price");
				Integer a=sc.nextInt();
				if(a==1) {
					System.out.println("What will be the new Product Name?");
					sc.nextLine();
					String newName = sc.nextLine();
					ps.update(id1,newName);
				}
				else if(a==2) {
					System.out.println("What will be the new Quantity?");
					Double qty = sc.nextDouble();
					ps.update(id1,qty);
				}
				else if(a==3) {
					System.out.println("What will be the new Price?");
					Double pri = sc.nextDouble();
					ps.update(id1,pri,1);
				}
				else
					System.out.println("Wrong Choice! ");
				break;
				
			case 4:
				ps.display();
				break;
				
			default:
				System.out.println("Thank you! \nSee you soon! \nExiting!!!");
				System.exit(0);
			}
			
		}

	}

}
