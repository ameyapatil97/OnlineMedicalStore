package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.bean.AdminUserBean;



public class User {

	public void choice(AdminUserBean adminUserBean) {
		while (true) {
			System.out.println("Enter Your Choice ");
			System.out.println("Press 1 for View Medicine");
			System.out.println("Press 2 for Add Medicine to Cart");
			System.out.println("Press 3 for Change Password");
			System.out.println("Press 4 for View Cart");
			System.out.println("Press 5 for Generate Bill");
			System.out.println("Press 6 for Discussion Board");
			System.out.println("Press 7 for Logout");
			Scanner scan = new Scanner(System.in);
			int choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			case 1:
				new ViewMedicine().viewMed();
				break;
			case 2:
				new AddCart().addcart();
				break;
			case 3:
				new UpdateUser().updateUser();
				break;
			case 4:
				new ViewCart().viewCart(); 
				break;
			case 5:
				new GenerateBill().bill();
				break;
//			case 6:
//				new Message().usermessage(userBean);
//				break;
			case 7:
				System.out.println("Successfully Logged Out..!!");
				new Logout().call();
				
				break;
			default:
				System.err.println("Invalid OutPut Please Enter Correct OutPut");
				break;
			}

		}
	}
	
}
