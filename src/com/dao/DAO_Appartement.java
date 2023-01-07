package com.dao;

import java.util.List;

import org.hibernate.Session;

import com.models.Appartement;
import com.models.Rue;

import ma.ismo.crjj.util.HibernateUtil;

public class DAO_Appartement implements IDao<Appartement> {

	@Override
	public List<Appartement> getAll() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		org.hibernate.Transaction tr = session .beginTransaction(); 
		
		List<Rue> etre=session.createQuery("from Appartement").getResultList();
		
		tr.commit();
		session.close();
		return etr;
	}

	@Override
	public Appartement getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Appartement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Appartement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Appartement obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
