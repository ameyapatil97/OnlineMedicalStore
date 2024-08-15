package com.capgemini.onlinemedicalstorecollection.controller;

import com.capgemini.onlinemedicalstorecollection.dao.CartDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class GenerateBill {

	public void bill() {
		
		CartDAO dao = MedicalStoreFactory.getCart();
		dao.getbill();
	}
	
}
