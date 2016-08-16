package com.yuxiaoli.service;

import com.yuxiaoli.entity.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public Customer selectCustomerById(int id);
}
