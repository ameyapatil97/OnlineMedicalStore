package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.Scanner;

public class Logout {

	public void call() {
		
		System.out.println("-----Welcome to Medical Store");
		System.out.println("1. Login");
		System.out.println("2. View Medicines");
		System.out.println("3. add user");
		System.out.println("Enter Your Choice : ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		sc.nextLine();
		switch (ch) {
		case 1:
			new Login().login();
			break;
		case 2:
			new ViewMedicine().viewMed();
			break;
		
		case 3:
			new AddUser().addUser();
			break;
		default:
			break;
		}
		
		
	}
	
}
