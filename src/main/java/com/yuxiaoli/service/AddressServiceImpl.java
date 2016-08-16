package com.yuxiaoli.service;

import com.yuxiaoli.dao.AddressDao;
import com.yuxiaoli.entity.Address;

public class AddressServiceImpl implements AddressService {
	private AddressDao addressDao;
	
	public AddressDao getAddressDao() {
		return addressDao;
	}

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	public Address selectByID(int id) {
		return addressDao.selectByID(id);
	}

}
