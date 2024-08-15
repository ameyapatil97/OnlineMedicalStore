package com.capgemini.onlinemedicalstorecollection.controller;

import com.capgemini.onlinemedicalstorecollection.dao.UserDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class RemoveUser {

	public void removeUser() {
		
		UserDAO dao = MedicalStoreFactory.getUser();
		dao.removeUser();
		
	}
	
}
