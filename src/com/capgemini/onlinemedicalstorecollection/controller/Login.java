package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.bean.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.dao.UserDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class Login {

	public void login() {

		UserDAO dao = MedicalStoreFactory.getUser();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email : ");
		String email = sc.nextLine();
		System.out.println("Enter Password : ");
		String pswd = sc.nextLine();

		AdminUserBean bean = dao.loginUser(email, pswd);
		if (bean != null) {
			System.out.println("Login Successful");
			if (bean.getType().equals("admin")) {
				System.out.println("Admin");
				new Admin().adminPage(bean);
			} else {
				System.out.println("User");
				new User().choice(bean);
			}

		} else {
			System.out.println("Not login");
		}
	}

}
