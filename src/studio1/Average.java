package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your first number you would like to average?");
		int n1 = in.nextInt();
		System.out.println("Wow, great choice?");
		System.out.println("What is your second number you would like to average?");
		int n2 = in.nextInt();
		System.out.println("Incredible number.");
		System.out.println("Average of your two numbers = " + (double) (n1 + n2) / 2);

	}

}
