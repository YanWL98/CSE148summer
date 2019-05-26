package p1;

import java.util.Scanner;

public class Demo {
// method
	public static void main(String[] args) {
		// input
		Scanner k = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = k.nextLine();
		//output
//		System.out.print(name);
		System.out.print("Hello, " + name + ", Nice meeting you!"); // output
	}

}
