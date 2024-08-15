package com.capgemini.onlinemedicalstorecollection.dao;

import com.capgemini.onlinemedicalstorecollection.bean.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.bean.CartBean;
import com.capgemini.onlinemedicalstorecollection.bean.MedicineBean;

public interface CartDAO {

	public CartBean addCart(MedicineBean mb , AdminUserBean ub);
	public CartBean getCart();
	public void getbill();
	
}
