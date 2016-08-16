package com.yuxiaoli.dao;

import org.apache.ibatis.session.SqlSession;

import com.yuxiaoli.entity.Address;
import com.yuxiaoli.util.MyBatisUtil;

public class AddressDaoImpl implements AddressDao {
	public AddressDaoImpl() {
	}
	public Address selectByID(int id) {
		SqlSession session=MyBatisUtil.getSession(true);
		Address address=new Address();
		try {
			address=(Address) session.selectOne("selectById", id);
		} finally {
			session.close();
		}
		return address;
	}
	public int selectCityById(int id) {
		SqlSession session=MyBatisUtil.getSession(true);
		int result;
		try {
			result=(Integer) session.selectOne("selectCountryId", id);
		} finally {
			session.close();
		}
		return result;
	}
	public void deleteAddressById(int id) {
		SqlSession session=MyBatisUtil.getSession(true);
		try {
			session.delete("deleteAddress", id);
		} finally {
			session.close();
		}
	}

}
