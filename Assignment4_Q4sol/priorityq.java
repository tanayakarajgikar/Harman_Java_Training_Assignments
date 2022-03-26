package pgm1;

import java.util.*;

public class priorityq {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		PriorityQueue<Product> pq1 = new
			PriorityQueue<Product>(5, new ProductComparator());
				
				Product product_1 = new Product(1,"Kitkat", 10.0);
				pq1.add(product_1);
				Product product_2 = new Product(2,"Perk", 15.5);
						pq1.add(product_2);		
				Product product_3 = new Product(3,"Dairy milk", 20.0);
						pq1.add(product_3);
				Product product_4 = new Product(4,"5 star", 50.0);
						pq1.add(product_4);
				Product product_5 = new Product(5,"milkybar", 20.0);
						pq1.add(product_5);
				
				
				System.out.println("Students served food as per their priority");
				
				while (!pq1.isEmpty()) {
				System.out.println(pq1.poll().getproductPrice());
		}
	}
}

class ProductComparator implements Comparator<Product>{
					
			public int compare(Product p1, Product p2) {
				if (p1.pPrice < p2.pPrice )
					return 1;
				else if (p1.pPrice > p2.pPrice)
					return -1;
								return 0;
				}
		}

class Product {
	public int pId;
	public String pName;
	public double pPrice;
		
	
	public Product(int pId,String pName, double pPrice) {
	    this.pId=pId;
		this.pName = pName;
		this.pPrice = pPrice;
		
	}
	
	public double getproductPrice() {
		return  pPrice;
	}
}