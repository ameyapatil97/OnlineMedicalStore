package com.capgemini.onlinemedicalstorecollection.database;


import java.util.ArrayList;

import com.capgemini.onlinemedicalstorecollection.bean.AdminUserBean;

public class AdminUserDB {

	public ArrayList<AdminUserBean> database() {
		
		ArrayList<AdminUserBean> ual = new ArrayList<AdminUserBean>();
		
		AdminUserBean u1 = new AdminUserBean();
		u1.setId(101);
		u1.setName("Ameya");
		u1.setEmail("amyp@gmail.com");
		u1.setPassword("apatil");
		u1.setType("admin");
		
		AdminUserBean u2 = new AdminUserBean();
		u2.setId(102);
		u2.setName("Rutuja");
		u2.setEmail("rutu@gmail.com");
		u2.setPassword("rutu");
		u2.setType("admin");
		
		AdminUserBean u3 = new AdminUserBean();
		u3.setId(201);
		u3.setName("omkar");
		u3.setEmail("omya@gmail.com");
		u3.setPassword("omya");
		u3.setType("user");
		
		AdminUserBean u4 = new AdminUserBean();
		u4.setId(202);
		u4.setName("harshal");
		u4.setEmail("hpatil@gmail.com");
		u4.setPassword("hpatil");
		u4.setType("user");
		
		ual.add(u1);
		ual.add(u2);
		ual.add(u3);
		ual.add(u4);
		
		return ual;
	}
	
}
