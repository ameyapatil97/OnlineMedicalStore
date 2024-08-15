package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.bean.AdminUserBean;

public class Admin {

	public void adminPage(AdminUserBean bean) {
		
		while (true) {
			System.out.println("Welcome to Admin Page");
			System.out.println("Enter Your Choice ");
			System.out.println("Press 1 for Add Medicine");
			System.out.println("Press 2 for View  Medicine");
			System.out.println("Press 3 for Remove  Medicine");
			System.out.println("Press 4 for  Add User");
			System.out.println("Press 5 for  View User");
			System.out.println("Press 6 for Remove User");
			System.out.println("Press 7 for Update Medicine");
			System.out.println("Press 8 for Discussion Board");
			System.out.println("Press 9 for Logout");
			Scanner scan = new Scanner(System.in);
			int choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			case 1:
				new AddMedicine().addMedicine();
				break;
			case 2:
				new ViewMedicine().viewMed();
				break;
			case 3:
				new RemoveMedicine().removeMed();
				break;
			case 4:
				new AddUser().addUser();
				break;
			case 5:
				new ViewUser().viewUser();
				break;
			case 6:
				new RemoveUser().removeUser();
				break;
			case 7:
				new UpdateMedicine().updateMed();
				break;
//			case 8:
//				new Message().adminmessage(userBean);
//				break;
			case 9:
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
