package com.cfang.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * dao公共方法基类
 * 
 * @author cfang
 * 2018年6月2日 下午12:21:45
 */
public class BaseDao<T> {

	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	/**
	 * 通过具体实现类，注入mapper.xml的namespace
	 */
	private String mappers;

	public T getById(String id){
		return sessionTemplate.selectOne(mappers.concat(".getById"), id);
	}
	
	public void update(T entity){
		sessionTemplate.update(mappers.concat(".update"), entity);
	}
	
	
	public void setMappers(String mappers) {
		this.mappers = mappers;
	}
}
