package com.tds.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.tds.Model.TdsMaster;


@Component("dao")
@Repository
@ComponentScan("com")
public class TdsDaoImpl implements TdsDao{
	
	
	@PersistenceContext
	EntityManager entityManager;

//creating a method to get id
	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		TdsMaster master=entityManager.find(TdsMaster.class,id);
		return master;

	}

}
