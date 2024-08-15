package com.capgemini.onlinemedicalstorecollection.main;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.controller.AddUser;
import com.capgemini.onlinemedicalstorecollection.controller.Login;
import com.capgemini.onlinemedicalstorecollection.controller.ViewMedicine;

public class CollectionMain {

	public static void main(String[] args) {

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
			new CollectionMain().main(null);
			break;
		
		case 3:
			new AddUser().addUser();
			break;
		default:
			break;
		}
		
		
	}

}
