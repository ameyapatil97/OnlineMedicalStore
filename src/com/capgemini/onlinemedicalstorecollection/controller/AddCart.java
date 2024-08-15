package com.capgemini.onlinemedicalstorecollection.controller;

import com.capgemini.onlinemedicalstorecollection.bean.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.bean.MedicineBean;
import com.capgemini.onlinemedicalstorecollection.dao.CartDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class AddCart {

	AdminUserBean bean = new AdminUserBean();
	MedicineBean medicineBean = new MedicineBean();
	
	public void addcart() {
		
		CartDAO dao = MedicalStoreFactory.getCart();
		dao.addCart(medicineBean, bean);
		
	}
}
