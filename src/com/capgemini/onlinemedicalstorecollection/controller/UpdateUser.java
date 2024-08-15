package com.capgemini.onlinemedicalstorecollection.controller;

import com.capgemini.onlinemedicalstorecollection.dao.UserDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class UpdateUser {

	public void updateUser() {
		UserDAO dao = MedicalStoreFactory.getUser();
		dao.updateMed();
	}
	
}
