package logicalPrograms;

import java.util.Scanner;

public class primeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int val = scan.nextInt();
		
		int count = 0;
		
		for(int i=2; i< val; i++){
			if(val%i == 0){
				count++;
			}
		}
		
		if(count > 0){
			System.out.println("Entered value is not prime number "+val);
		}
		else{
			System.out.println("Entered value is prime number "+val);
		}
	}

}
