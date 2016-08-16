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

}
