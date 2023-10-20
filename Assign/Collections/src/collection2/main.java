package collection2;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Set<Product> products = new HashSet<>();
        products.add(new Product(1, "Hari"));
        products.add(new Product(2, "Harshita"));
        products.add(new Product(1, "Hari"));
        products.add(new Product(3, "Harish"));
        products.add(new Product(2, "Harshita"));
        
//        System.out.println(products);
        for(Product product : products) {
        	System.out.println(product);
        }

	}

}
