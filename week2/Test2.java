package week2;


/*
 * Emily Kabat 
 * 2/7/19 
 * Finding the average of 3 numbers 
 */
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		

		Scanner scnr = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int average;
		
		System.out.println("Enter the first number:");
		num1 = scnr.nextInt();
		System.out.println("Enter the second number:");
		num2 = scnr.nextInt();
		System.out.println("Enter the third number:");
		num3 = scnr.nextInt();
		
		average = (num1 + num2 + num3) / 3;
		
		System.out.println("The average is " + average);
		
	}

}
