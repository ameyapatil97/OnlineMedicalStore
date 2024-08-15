package com.capgemini.onlinemedicalstorecollection.dao;

import com.capgemini.onlinemedicalstorecollection.bean.AdminUserBean;

public interface UserDAO {

	public AdminUserBean loginUser(String email, String password);
	public AdminUserBean getUser();
	public boolean addUser();
	public AdminUserBean updateMed();
	public boolean removeUser();
	
}
