package sybcaB202;

import java.util.Scanner;

public class AddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter the second number: ");
		int num2=scan.nextInt();		
		sum=num1+num2;
		System.out.println("The sum of two numbers is: "+sum);
		

	}

}
