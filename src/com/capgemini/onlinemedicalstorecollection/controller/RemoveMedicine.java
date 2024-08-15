package com.capgemini.onlinemedicalstorecollection.controller;

import com.capgemini.onlinemedicalstorecollection.dao.MedicineStoreDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class RemoveMedicine {

	
	public void removeMed() {
	
		MedicineStoreDAO dao = MedicalStoreFactory.getMedicine();
		dao.removeMedicine();
		
	}
	
}
