package com.cfang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cfang.dao.UserInfoDao;
import com.cfang.entity.TblUserInfo;
import com.cfang.service.IUserInfoService;

@Service
public class UserInfoService implements IUserInfoService{

	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	@Transactional
	public void updateUserInfo(TblUserInfo userInfo) throws Exception {
		TblUserInfo result = userInfoDao.getById("1");
		userInfoDao.update(result);
		int j = 1/0;
	}

}
