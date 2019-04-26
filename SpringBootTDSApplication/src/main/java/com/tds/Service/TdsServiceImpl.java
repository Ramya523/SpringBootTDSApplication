package com.tds.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tds.Dao.TdsDao;
import com.tds.Model.TdsMaster;


@Component("masterService")
@Service   //identify the service class
@Transactional
public class TdsServiceImpl implements TdsService {
	
	
	@Autowired
	TdsDao dao;


	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

}
