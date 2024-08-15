package com.capgemini.onlinemedicalstorecollection.dao;

import com.capgemini.onlinemedicalstorecollection.bean.MedicineBean;

public interface MedicineStoreDAO {

	public MedicineBean getMedicine();
	public MedicineBean addMedicine();
	public boolean removeMedicine();
	public MedicineBean updateMedicine();
	
}
