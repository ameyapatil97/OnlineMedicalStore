package com.capgemini.onlinemedicalstorecollection.controller;

import com.capgemini.onlinemedicalstorecollection.dao.MedicineStoreDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class UpdateMedicine {

	public void updateMed() {
		MedicineStoreDAO dao = MedicalStoreFactory.getMedicine();
		dao.updateMedicine();
	}
	
}
