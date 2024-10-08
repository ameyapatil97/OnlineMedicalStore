package com.capgemini.onlinemedicalstorecollection.database;

import java.util.ArrayList;

import com.capgemini.onlinemedicalstorecollection.bean.MedicineBean;

public class MedicineDb {

	public ArrayList<MedicineBean> medDB(){
		
		ArrayList<MedicineBean> mal = new ArrayList<MedicineBean>();
		
		MedicineBean m1 = new MedicineBean();
		m1.setMedicineId(201);
		m1.setMedicineName("Crocine");
		m1.setPrice(200);
		m1.setCategory("Allopathic");
		
		MedicineBean m2 = new MedicineBean();
		m2.setMedicineId(202);
		m2.setMedicineName("Paracetamol");
		m2.setPrice(250);
		m2.setCategory("Allopathic");
		
		mal.add(m1);
		mal.add(m2);
		
		return mal;
		
	}
	
}
