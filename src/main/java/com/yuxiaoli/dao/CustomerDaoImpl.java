package com.yuxiaoli.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.yuxiaoli.entity.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

	public void addCustomer(Customer customer) {
		SqlSession session=this.getSqlSession();
		session.insert("addCustomer", customer);
	}

}
