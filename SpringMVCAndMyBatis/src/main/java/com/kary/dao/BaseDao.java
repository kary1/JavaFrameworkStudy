package com.kary.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDao {
	private static SqlSessionFactory sf = null;

	private static SqlSessionFactory buildFactory() throws IOException {
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		InputStream is = Resources.getResourceAsStream("MyBatis.xml");
		sf = sfb.build(is);
		return sf;
	}

	synchronized public static SqlSession getSqlSession() {
		if (sf == null) {
			try {
				sf = buildFactory();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sf.openSession();
	}
}
