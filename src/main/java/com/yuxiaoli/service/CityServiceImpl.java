package com.yuxiaoli.service;

import com.yuxiaoli.dao.CityDao;

public class CityServiceImpl implements CityService {
	private CityDao cityDao;
	
	public CityDao getCityDao() {
		return cityDao;
	}

	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	public int selectCountryById(int id) {
		return cityDao.selectCountryById(id);
	}

	public void deleteCityById(int id) {
		cityDao.deleteCityById(id);
		
	}

}
