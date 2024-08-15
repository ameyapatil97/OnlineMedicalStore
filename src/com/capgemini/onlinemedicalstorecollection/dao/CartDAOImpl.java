package com.capgemini.onlinemedicalstorecollection.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.bean.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.bean.CartBean;
import com.capgemini.onlinemedicalstorecollection.bean.MedicineBean;
import com.capgemini.onlinemedicalstorecollection.database.AdminUserDB;
import com.capgemini.onlinemedicalstorecollection.database.CartDB;
import com.capgemini.onlinemedicalstorecollection.database.MedicineDb;


public class CartDAOImpl implements CartDAO {

	public static ArrayList<CartBean> cartList = new CartDB().cartDB();
	public static ArrayList<AdminUserBean> userList = new AdminUserDB().database();
	public static ArrayList<MedicineBean> medList = new MedicineDb().medDB();
	Iterator<CartBean> ic = cartList.iterator();
	Iterator<AdminUserBean> iu = userList.iterator();
	Iterator<MedicineBean> im = medList.iterator();
	CartBean cbean = new CartBean();
	Scanner sc = new Scanner(System.in);
	int price = 0;

	@Override
	public CartBean addCart(MedicineBean mb, AdminUserBean ub) {

		boolean isAvail;
		do {
			isAvail = false;
			int id = cartList.size() + 100;
			while (ic.hasNext()) {
				CartBean cbb = ic.next();
				isAvail = true;
			}
			if (!isAvail) {
				cbean.setCartId(id);
				cbean.setUserId(ub.getId());
				System.out.println("Enter Medicine Id to Add :");
				int mid = Integer.parseInt(sc.nextLine());
				if (mid == mb.getMedicineId()) {
					cbean.setMedId(mid);
					cbean.setPrice(mb.getPrice());
				}
				cartList.add(cbean);
				System.out.println("Added to Cart");

			}
		} while (isAvail);

		return cbean;

	}

	@Override
	public CartBean getCart() {

		System.out.println("---Cart---");
		CartBean cbean = new CartBean();
		// MedicineDb mdb = new MedicineDb();
		while (ic.hasNext() && iu.hasNext() && im.hasNext()) {
			CartBean cb = ic.next();
			MedicineBean mb = im.next();
			AdminUserBean ub = iu.next();
			int uid = ub.getId();
			int mid = mb.getMedicineId();
			int prc = mb.getPrice();
			System.out.println("Cart id :" + cb.getCartId());
			System.out.println("User id : " + uid);
			System.out.println("Medicine id : " + mid);
			System.out.println("Price : " + prc);
			System.out.println("-----------------------------");
			cb = cbean;
		}

		return cbean;
	}

	@Override
	public void getbill() {

			
			
		System.out.println("Your Bill is : " + price);

	}
}
