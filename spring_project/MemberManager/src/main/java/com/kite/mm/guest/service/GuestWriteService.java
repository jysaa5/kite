package com.kite.mm.guest.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;
import com.kite.mm.guest.domain.WriteRequest;

@Service
public class GuestWriteService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private GuestDao dao;
		
	public int write(WriteRequest request) {
		
		dao = template.getMapper(GuestDao.class);
		
		return dao.insertArticle(request);
	}
	
	
	
	
	

}
