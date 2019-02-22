package com.yang.test;

import com.yang.dao.UserDao;

public class MainTest {
	public static void main(String[] args) {
		UserDao ud = new UserDao();
		boolean result = ud.addUser();
		if(result) {
			System.out.println(">>>>>>>>>success！");
		}else {
			System.out.println(">>>>>>>>failed！");
		}
	}
}
