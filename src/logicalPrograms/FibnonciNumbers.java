package logicalPrograms;

import java.util.Scanner;

public class FibnonciNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value");
		int val = scan.nextInt();
		
		int sum = 0, m=0, n=1;
		
		for(int i = 0; i< val; i++){
			sum = m + n;
			System.out.print(sum+" ");
			n = m;
			m = sum;
		}

	}

}
