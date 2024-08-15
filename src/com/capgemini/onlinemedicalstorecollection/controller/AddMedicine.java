package com.capgemini.onlinemedicalstorecollection.controller;

import com.capgemini.onlinemedicalstorecollection.dao.MedicineStoreDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class AddMedicine {

	public void addMedicine() {
		MedicineStoreDAO dao = MedicalStoreFactory.getMedicine();
		dao.addMedicine();
	}
	
}
