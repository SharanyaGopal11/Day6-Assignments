package logicalPrograms;

import java.util.Scanner;

public class reverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value to reverse a number");
		int number = scan.nextInt();
		
		int reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		
		System.out.println("Entered value is "+number+" reversed value is "+reverse);
	}

}
