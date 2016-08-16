package com.yuxiaoli.dao;

import com.yuxiaoli.entity.Address;

public interface AddressDao {
	public Address selectByID(int id);
	public int selectCityById(int id);
	public void deleteAddressById(int id);
}
