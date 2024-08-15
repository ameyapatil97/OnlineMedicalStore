package com.capgemini.onlinemedicalstorecollection.bean;

public class MedicineBean {

	private int medicineId;
	private String medicineName;
	private int price;
	private String category;
	
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "MedicineBean [medicineId=" + medicineId + ", medicineName=" + medicineName + ", price=" + price
				+ ", category=" + category + "]";
	}

	
	
}
