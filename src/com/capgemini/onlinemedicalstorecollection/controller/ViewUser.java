package com.capgemini.onlinemedicalstorecollection.controller;

import com.capgemini.onlinemedicalstorecollection.dao.UserDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class ViewUser {

	public void viewUser() {
		UserDAO dao = MedicalStoreFactory.getUser();
		dao.getUser();
	}
	
}
