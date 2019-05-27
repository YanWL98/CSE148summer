package p3;

import java.util.Scanner;

public class Hm {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter restaurant's name:");
		String name = kb.nextLine();
		System.out.println("Please enter restaurant's Address:");
		String Address = kb.nextLine();
		System.out.println("Please enter restaurant's Tel:");
		String Tel = kb.nextLine();
		System.out.println("Here's the restaurant imformation and menu");
		System.out.println("\tRestaurant\t" + name + "\n\tAddress\t\t" + Address + "\n\tTel\t\t" + Tel
				+ "\n---------------------------------\n"
				+ "\t1. Chicken\t$10.00\n\t2. Beef\t\t$20.00\n\t3. Pork\t\t$15.00\n\t4. Vegetable\t$5.00\n\t5. Drink\t$5.00");
		

	}

}
