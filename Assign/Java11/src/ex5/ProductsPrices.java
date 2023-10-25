package ex5;

import java.util.Scanner;

public class ProductsPrices {
	public static void main(String[] args) {
		boolean flag = true;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		while(flag) {
			System.out.println("Select your option");
			System.out.println("1: Insert New Price, 2: View Purchase Total, 3: Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: { System.out.println("Insert " + (++i) + " product price ");
					int price = scanner.nextInt();
					sum += price;
					System.out.println("Price has been saved to the file");
					System.out.println("Do you want to enter price for more items? (Yes/No)");
					String inputString = scanner.next();
					if(inputString == "No" || inputString == "NO" || inputString == "no") {
						
					}
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}
		scanner.close();
		
	}

}
