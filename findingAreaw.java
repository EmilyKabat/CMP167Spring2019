/*
 * findingArea 
 * Emily Kabat
 * This program implements area functions/method
 */

import java.util.Scanner;

public class findingAreaw {
	public static void rectArea() {
		Scanner scnr = new Scanner(System.in);
		int width;
		int length;
		int area;
		// input
		
		System.out.println("Enter width: ");
		width = scnr.nextInt();
		System.out.println("Enter length: ");;
		length = scnr.nextInt();
		
		// process/calculations
		area = length * width;
		
		//output
		System.out.println("The area is " + area);
	}


/* 
 * circleArea
 * Emily Kabat
 * This program implements area functions/method
 */
	public static void circleArea() {
		Scanner scnr = new Scanner(System.in);
		int radius;
		double area;
		// input
		
		System.out.println("Enter the radius: ");
		radius = scnr.nextInt();
		
		//calculations
		area = Math.pow(radius,  2) * 3.14;
		
		//output
		System.out.println("The area is " + area);
	}
	
	
	
	public static void triangleArea() {
		Scanner scnr = new Scanner(System.in);
		int height;
		int base;
		double area;
		
		System.out.println("Enter height: ");
		height = scnr.nextInt();
		
		System.out.println("Enter base: ");
		base = scnr.nextInt();
		
		area = (base * height) / 2;
		
		System.out.println("The area is " + area);
	}
	
	public static void main(String[] args) {
		circleArea();
		triangleArea();
	}

}

