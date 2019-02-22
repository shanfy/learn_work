package com.yang.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserUtil {
	private static SqlSessionFactory ssf;
	private static SqlSession ss;
	public static SqlSession getSqlSession() {
		InputStream is=null;
		try {
			 is = Resources.getResourceAsStream("mybatis.xml");
			ssf = new SqlSessionFactoryBuilder().build(is);
			ss=ssf.openSession();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ss;
	}
}
