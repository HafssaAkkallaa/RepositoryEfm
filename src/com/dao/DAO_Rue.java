package com.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.models.Rue;

import ma.ismo.crjj.util.HibernateUtil;

public class DAO_Rue implements IDao<Rue> {

	@Override
	public List<Rue> getAll() {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		org.hibernate.Transaction tr = session .beginTransaction(); 
		
		List<Rue> etr=session.createQuery("from Entreprise").getResultList();
		
		tr.commit();
		session.close();
		return etr;
		
	}

	@Override
	public Rue getOne(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		org.hibernate.Transaction t = session.beginTransaction();

		Rue entreprise = session.get(Rue.class, id);

		t.commit();
		session.close();
		return entreprise;
	}

	@Override
	public boolean save(Rue obj) {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateUtil.getSessionfactory().getCurrentSession();
			org.hibernate.Transaction t = session.beginTransaction();

			Object o = session.save(obj);

			System.out.println(o);

			t.commit();
			session.close();

			if (o == null)
				return false;
			else
				return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Rue obj) {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateUtil.getSessionfactory().getCurrentSession();
			Transaction t = (Transaction) session.beginTransaction();

			session.update(obj);

			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Rue obj) {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateUtil.getSessionfactory().getCurrentSession();
			org.hibernate.Transaction t = session.beginTransaction();

			session.delete(obj);

			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
