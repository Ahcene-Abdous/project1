package JavaAPI;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare 2 var to hold the user input
		Scanner Firstn  = new Scanner(System.in);
		Scanner Secondn = new Scanner(System.in);
		
		//Invite user to enter 2 numbers
		System.out.println("Enter the first number: ");
		int firstin  = Firstn.nextInt();//Get the user input
		
		System.out.println("Enter the second number: ");
		int secondin = Secondn.nextInt();
		 
		int result = firstin * secondin;// Multiplicate the 2 numbers and store the result in result
		//Print out the two numbers with the result
		System.out.print(firstin+ " * " + secondin + " = " + result);
		
		Firstn.close();
		Secondn.close();
//switch statement 
		switch(firstin){
		case 9:
			System.out.print(" Excellent");
			break;
		case 8:
			System.out.print(" Very good");
			break;
		default:
			System.out.print(" The result is ok, but "+firstin+" is not in range!");
			break;
		}
		

	}

}
