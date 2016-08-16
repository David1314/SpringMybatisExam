package com.yuxiaoli.dao;

import org.apache.ibatis.session.SqlSession;

import com.yuxiaoli.entity.Address;
import com.yuxiaoli.entity.Customer;
import com.yuxiaoli.util.MyBatisUtil;

public class CustomerDaoImpl  implements CustomerDao {
	public CustomerDaoImpl() {
	}
	public void addCustomer(Customer customer) {
		SqlSession session=MyBatisUtil.getSession(true);
		try {
			session.insert("addCoustomer", customer);
			int address_id=customer.getAddress_id();
			Address address=(Address) session.selectOne("selectById", address_id);
			System.out.println("已经保存的数据如下：");
			System.out.println("ID:"+customer.getCustomer_id());
			System.out.println("FirstName:"+customer.getFirst_name());
			System.out.println("LastName:"+customer.getLast_name());
			System.out.println("Email:"+customer.getEmail());
			System.out.println("Address:"+address.getAddress());
		}finally {
			session.close();
		}
	}
	public Customer selectCustomerById(int id) {
		SqlSession session=MyBatisUtil.getSession(true);
		Customer customer=new Customer();
		try {
			customer=(Customer) session.selectOne("selectCustomerById", id);
		} finally {
			session.close();
		}
		return customer;
	}
	public void deleteCustomer(int id) {
		SqlSession session=MyBatisUtil.getSession(true);
		try {
			session.update("change");
			session.delete("deleteCustomer", id);
			System.out.println("你输入的ID为"+id+"的Customer已经删除。");
		} finally {
			session.close();
		}
		
	}

}
