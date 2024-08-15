package com.capgemini.onlinemedicalstorecollection.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.bean.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.bean.MedicineBean;
import com.capgemini.onlinemedicalstorecollection.database.AdminUserDB;

public class UserDAOImpl implements UserDAO {

	public static ArrayList<AdminUserBean> userlist = new AdminUserDB().database();
	Iterator<AdminUserBean> it = userlist.iterator();
	AdminUserDB db = new AdminUserDB();
	ArrayList<AdminUserBean> ual = new ArrayList<AdminUserBean>();
	Scanner sc = new Scanner(System.in);

	@Override
	public AdminUserBean loginUser(String email, String password) {

		AdminUserBean bean = new AdminUserBean();

		while (it.hasNext()) {

			AdminUserBean user = it.next();
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				bean = user;
			}
		}

		return bean;
	}

	@Override
	public AdminUserBean getUser() {
		AdminUserBean ub = new AdminUserBean();
		System.out.println("------Users--------");

		while (it.hasNext()) {
			AdminUserBean user = it.next();
			if (user.getType().equals("user")) {
				System.out.println(user.getId());
				System.out.println(user.getName());
				System.out.println(user.getEmail());
				System.out.println(user.getPassword());
				System.out.println(user.getType());
				ub = user;
			}
		}
		return ub;
	}

	@Override
	public boolean addUser() {
		AdminUserBean bean = new AdminUserBean();
		userlist.add(bean);
		return true;
	}

	@Override
	public AdminUserBean updateMed() {

		AdminUserBean ub = new AdminUserBean();
		boolean ismedPresent = false;
		boolean noLooper = true;
		while (noLooper) {
			System.out.print("\nEnter User ID to Modify : ");
			int uID = sc.nextInt();

			while (it.hasNext()) {
				AdminUserBean us = it.next();

				if (uID == us.getId()) {
					ismedPresent = true;
					noLooper = false;

					System.out.println("\nChange the Information for User ID " + us.getId());

//					System.out.print("\nUser Name : ");
//					sc.nextLine();
//					us.setUserName(sc.nextLine());
//					System.out.println("User Email : ");
//					sc.nextLine();
//					us.setUserEmail(sc.nextLine());
					System.out.println("Enter Password to change : ");
					sc.nextLine();
					us.setType(sc.nextLine());
					System.out.println("Changed");
//					System.out.println("Set type of User :\n1. Admin\n2. User");
//					int set = Integer.parseInt(sc.nextLine());
//					switch (set) {
//					case 1:
//						us.setUserType("Admin");
//						break;
//					case 2:
//						us.setUserType("User");
//						break;
//					default:
//						break;
//					}

				}

			}

			if (!ismedPresent) {
				System.out.println("Medicine with this ID is not present. Try again.");
			}
		}
		return ub;
	}

	@Override
	public boolean removeUser() {

		boolean isAvail;

		isAvail = false;
		System.out.println("Enter User Id :");
		int id = Integer.parseInt(sc.nextLine());

		for (AdminUserBean adminUserBean : userlist) {
			if (id == adminUserBean.getId()) {

				userlist.remove(adminUserBean);
				System.out.println("Removed");
				isAvail = true;
				break;

			} else {
				isAvail = false;
			}

		}
		if (!isAvail) {
			System.out.println("User is not present");
		}

		return isAvail;

	}

}
