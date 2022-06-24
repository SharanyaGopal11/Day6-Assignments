package logicalPrograms;

import java.util.Scanner;

public class perfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int num = scan.nextInt();
		
		int sum = 0;
		
		for(int i =1; i< num ; i++){
			if(num%i == 0){
				sum = sum + i;
			}
		}
		
		if(sum == num){
			System.out.println("Entered value is perfect value "+num);
		}
		else{
			System.out.println("Entered value is not perfect value "+num);
		}
	}

}
