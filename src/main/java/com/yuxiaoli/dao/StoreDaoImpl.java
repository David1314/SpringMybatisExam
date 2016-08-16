package com.yuxiaoli.dao;

import org.apache.ibatis.session.SqlSession;

import com.yuxiaoli.util.MyBatisUtil;

public class StoreDaoImpl implements StoreDao {

	public void deleteStore(int id) {
		SqlSession session=MyBatisUtil.getSession(true);
		try {
			session.delete("deleteStore", id);
		} finally {
			session.close();
		}

	}

}
