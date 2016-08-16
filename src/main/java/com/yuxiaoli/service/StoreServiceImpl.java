package com.yuxiaoli.service;

import com.yuxiaoli.dao.StoreDao;

public class StoreServiceImpl implements StoreService {
	private StoreDao storeDao;
	
	public StoreDao getStoreDao() {
		return storeDao;
	}

	public void setStoreDao(StoreDao storeDao) {
		this.storeDao = storeDao;
	}

	public void deleteStore(int id) {
		storeDao.deleteStore(id);
	}

}
