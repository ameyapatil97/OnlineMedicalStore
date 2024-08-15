package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.List;

import com.capgemini.onlinemedicalstorecollection.bean.MedicineBean;
import com.capgemini.onlinemedicalstorecollection.dao.MedicineStoreDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class ViewMedicine {

	public void viewMed() {
		
		MedicineStoreDAO dao = MedicalStoreFactory.getMedicine();
		dao.getMedicine();
		
		
	}
	
}
