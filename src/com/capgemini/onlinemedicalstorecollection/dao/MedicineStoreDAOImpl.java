package com.capgemini.onlinemedicalstorecollection.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.bean.MedicineBean;
import com.capgemini.onlinemedicalstorecollection.database.MedicineDb;

public class MedicineStoreDAOImpl implements MedicineStoreDAO {

	public static ArrayList<MedicineBean> m = new MedicineDb().medDB();
	Iterator<MedicineBean> mi = m.iterator();
	MedicineBean bean = new MedicineBean();
	Scanner sc = new Scanner(System.in);

	@Override
	public MedicineBean getMedicine() {

		MedicineBean mm = new MedicineBean();
		System.out.println("------------Medicines---------");
		while (mi.hasNext()) {
			MedicineBean med = mi.next();
			System.out.println("Medicine Id :       " + med.getMedicineId());
			System.out.println("Medicine Name :     " + med.getMedicineName());
			System.out.println("Medicine Price :    " + med.getPrice());
			System.out.println("Medicine Category : " + med.getCategory());
			System.out.println("------------------------------------");
			mm = med;
		}
		return mm;
	}

	@Override
	public MedicineBean addMedicine() {

		boolean isAvail;
		do {
			isAvail = false;
			System.out.println("Enter Medicine Id :");
			int id = Integer.parseInt(sc.nextLine());

			while (mi.hasNext()) {
				MedicineBean med = mi.next();
				if (id == bean.getMedicineId()) {
					System.out.println("Medicine is Present ...");
					isAvail = true;
				}

			}
			if (!isAvail) {
				bean.setMedicineId(id);
				System.out.println("Enter Medicine name : ");
				bean.setMedicineName(sc.nextLine());
				System.out.println("Enter Price : ");
				bean.setPrice(sc.nextInt());
				System.out.println("Enter Category :");
				sc.nextLine();
				bean.setCategory(sc.nextLine());

				m.add(bean);
				System.out.println("Medicine Added Successfully");
			}
		} while (isAvail);

		return null;
	}

	@Override
	public boolean removeMedicine() {

		boolean isAvail;

		isAvail = false;
		System.out.println("Enter Medicine Id :");
		int id = Integer.parseInt(sc.nextLine());

		for (MedicineBean medicineBean : m) {
			if (id == medicineBean.getMedicineId()) {

				m.remove(medicineBean);
				System.out.println("Removed");
				isAvail = true;
				break;

			} else {
				isAvail = false;
			}

		}
		if (!isAvail) {
			System.out.println("Medicine is not present");
		}

		return isAvail;
	}

	@Override
	public MedicineBean updateMedicine() {
		boolean ismedPresent = false;
		boolean noLooper = true;
		while (noLooper) {
			System.out.print("\nEnter Medicine ID to Modify : ");
			int mdID = sc.nextInt();

			while (mi.hasNext()) {
				MedicineBean med = mi.next();

				if (mdID == med.getMedicineId()) {
					ismedPresent = true;
					noLooper = false;

					System.out.println("\nChange the Information for Medicine ID " + med.getMedicineId());

					System.out.print("\nMedicine Price : ");
					sc.nextLine();
					med.setPrice(Integer.parseInt(sc.nextLine()));

				}

			}

			if (!ismedPresent) {
				System.out.println("Medicine with this ID is not present. Try again.");
			}
		}
		return bean;
	}

}
