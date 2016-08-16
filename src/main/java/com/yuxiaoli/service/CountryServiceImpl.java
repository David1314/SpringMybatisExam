package com.yuxiaoli.service;

import com.yuxiaoli.dao.CountryDao;

public class CountryServiceImpl implements CountryService {
	private CountryDao countryDao;
	
	public CountryDao getCountryDao() {
		return countryDao;
	}

	public void setCountryDao(CountryDao countryDao) {
		this.countryDao = countryDao;
	}

	public void deleteCountryById(int id) {
		countryDao.deleteCountryById(id);
	}

}
