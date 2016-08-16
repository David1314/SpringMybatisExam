package com.yuxiaoli.service;

import com.yuxiaoli.entity.Address;

public interface AddressService {
	public Address selectByID(int id);
	public int selectCityById(int id);
	public void deleteAddressById(int id);
}
