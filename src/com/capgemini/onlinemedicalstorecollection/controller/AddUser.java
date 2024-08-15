package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.dao.UserDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class AddUser {

	public void addUser() {
		UserDAO dao = MedicalStoreFactory.getUser();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id :");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter User Name : ");
		String nm = sc.nextLine();
		System.out.println("Enter Email : ");
		String email = sc.nextLine();
		System.out.println("Enter Password : ");
		String pswd = sc.nextLine();
		System.out.println("Select User Type :");
		System.out.println("1. Admin \n2. User");
		int ch = Integer.parseInt(sc.nextLine());
		String type = null;
		switch (ch) {
		case 1:
			type = "admin";
			break;
		case 2 :
			type = "user";
			break;
		default:
			break;
		}
		
		if(dao.addUser()) {
			System.out.println("User Added");
			new Login().login();
		}
		
	}
	
}
