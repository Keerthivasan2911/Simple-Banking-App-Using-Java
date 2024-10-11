package com.banking;

import java.util.Scanner;

public class Atm_bank {
	public static void main(String[] args) {
		int pin=123;
		int balance=10000;
		int Add_amount=0;
		int Take_amount=0;
		String name;
		int opt;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your pin number: ");
		
		int password= scanner.nextInt();
	
		if(password==pin) {
			
			
			System.out.println("Enter your Name: ");
			name= scanner.next();
			System.out.println("Welcome "+name);
			
			while(true) {
				System.out.println("Press 1 to check your balance");
				System.out.println("Press 2 to add amount");
				System.out.println("Press 3 to Take amount");
				System.out.println("Press 4 to take reciept");
				System.out.println("Press 5 to EXIT");
			
				opt= scanner.nextInt();
				switch (opt) {
				case 1:
					System.out.println("Your Balance is: "+balance);
					break;
				case 2:
					System.out.println("Amount to be Added:");
					Add_amount=scanner.nextInt();
					System.out.println("Amount added Successfully");
					balance=Add_amount+balance;
					break;
					
				case 3:
					System.out.println("How much money need to take?");
					Take_amount=scanner.nextInt();
					if(Take_amount>balance) {
						System.out.println("Insufficient Balance");
					}
					else {
						System.out.println("Amount Credited");
						balance=balance-Take_amount;
					}
					break;
				case 4:
                    System.out.println("Welcome");
                    System.out.println("Available Balance: " + balance);
                    System.out.println("Amount Deposited: " + Add_amount);
                    System.out.println("Amount Taken: " + Take_amount);
                    System.out.println("Press any key to continue...");
                    scanner.next(); // Wait for user input
                    break;
                case 5:
                    System.out.println("Thank-You");
                    scanner.close(); // Close the scanner
                    return; // Exit the program
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
				}
			
				
			}
			
			
		}
		
		
	
		else {
			System.out.println("Wrong Password");
	
	}
	
		
	}

}
