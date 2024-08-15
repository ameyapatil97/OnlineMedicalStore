package com.capgemini.onlinemedicalstorecollection.factory;

import com.capgemini.onlinemedicalstorecollection.dao.CartDAO;
import com.capgemini.onlinemedicalstorecollection.dao.CartDAOImpl;
import com.capgemini.onlinemedicalstorecollection.dao.MedicineStoreDAO;
import com.capgemini.onlinemedicalstorecollection.dao.MedicineStoreDAOImpl;
import com.capgemini.onlinemedicalstorecollection.dao.UserDAO;
import com.capgemini.onlinemedicalstorecollection.dao.UserDAOImpl;

public class MedicalStoreFactory {

public  static UserDAO getUser() {
		
		return new UserDAOImpl();
		
	}
	
	public static MedicineStoreDAO getMedicine() {
		return new MedicineStoreDAOImpl();
	}
	
	public static CartDAO getCart() {
		return new CartDAOImpl();
	}
}
