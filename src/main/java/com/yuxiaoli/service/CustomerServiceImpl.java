package com.yuxiaoli.service;

import com.yuxiaoli.dao.CustomerDao;
import com.yuxiaoli.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	public Customer selectCustomerById(int id) {
		return customerDao.selectCustomerById(id);
	}

	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}
	
	

}
