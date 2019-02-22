package com.yang.dao;

import org.apache.ibatis.session.SqlSession;

import com.yang.entity.User;
import com.yang.util.UserUtil;

public class UserDao {
	private static SqlSession ss;
	static {
		ss=UserUtil.getSqlSession();
	}
	public boolean addUser() {
		System.out.println("=====addUser======");
		User user = new User();
		user.setId(2);
		user.setUsername("jack");
		user.setUserpass("123456");
		user.setSex("男");
		int a = ss.insert("test.add", user);
		ss.commit();
		if(a>0) {
			System.out.println(">>>>>>a="+a);
			return true;
		}
		return false;
	}
}
