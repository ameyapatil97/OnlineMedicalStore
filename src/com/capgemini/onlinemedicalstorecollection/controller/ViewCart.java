package com.capgemini.onlinemedicalstorecollection.controller;

import com.capgemini.onlinemedicalstorecollection.dao.CartDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class ViewCart {

	public void viewCart() {
		
		CartDAO dao = MedicalStoreFactory.getCart();
		dao.getCart();
		
	}
	
}
