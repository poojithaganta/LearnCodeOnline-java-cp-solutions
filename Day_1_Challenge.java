package learncodeonline;

import java.util.Scanner;
public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		int digit = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(digit + " * " + i + " = " + digit*i);
		}
	}

}
