package com.yuxiaoli.dao;

import org.apache.ibatis.session.SqlSession;

import com.yuxiaoli.util.MyBatisUtil;

public class CountryDaoImpl implements CountryDao {

	public void deleteCountryById(int id) {
		SqlSession session=MyBatisUtil.getSession(true);
		try {
			session.delete("deleteCountry",id);
		} finally{
			session.close();
		}
	}

}
