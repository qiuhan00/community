package com.cfang.dao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.cfang.entity.TblUserInfo;

@Repository(value="userInfoDao")
public class UserInfoDao extends BaseDao<TblUserInfo>{

	@Value("com.cfang.mapper.UserInfoMapper")
	private String mappers;
	
	@PostConstruct
	public void initMappers(){
		super.setMappers(mappers);
	}
	
	public void update(TblUserInfo userInfo){
		super.update(userInfo);
	}
	
}
