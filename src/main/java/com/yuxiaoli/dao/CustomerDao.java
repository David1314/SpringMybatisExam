package com.yuxiaoli.dao;

import com.yuxiaoli.entity.Customer;

public interface CustomerDao {
	
	public void addCustomer(Customer customer);
	public Customer selectCustomerById(int id);
	public void deleteCustomer(int id);
}
