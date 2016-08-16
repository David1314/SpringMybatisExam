package com.yuxiaoli.dao;

import org.apache.ibatis.session.SqlSession;

import com.yuxiaoli.util.MyBatisUtil;

public class CityDaoImpl implements CityDao {

	public int selectCountryById(int id) {
		SqlSession session=MyBatisUtil.getSession(true);
		int result;
		try {
			result=(Integer) session.selectOne("selectCountryById", id);
//			System.out.println("country_id"+result);
		} finally {
			session.close();
		}
		return result;
	}

	public void deleteCityById(int id) {
		SqlSession session=MyBatisUtil.getSession(true);
		try {
			session.delete("deleteCity", id);
		} finally {
			session.close();
		}
		
	}

}
