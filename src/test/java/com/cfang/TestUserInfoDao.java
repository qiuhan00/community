package com.cfang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.alibaba.fastjson.JSON;
import com.cfang.dao.UserInfoDao;
import com.cfang.entity.TblUserInfo;
import com.cfang.service.IUserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
//@TransactionConfiguration(transactionManager="transactionManager")
public class TestUserInfoDao extends AbstractTransactionalJUnit4SpringContextTests{

	@Autowired
	private UserInfoDao userInfoDao;
	@Autowired
	private IUserInfoService userInfoService;
	
	@Test
	@Rollback
	public void getById() throws Exception{
//			TblUserInfo userInfo = userInfoDao.getById("1");
//			System.out.println(JSON.toJSONString(userInfo));
//			userInfoDao.update(userInfo);
			
			userInfoService.updateUserInfo(null);
	}
}
