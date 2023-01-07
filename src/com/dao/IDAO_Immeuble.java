package com.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.models.Immeuble;
import com.models.Rue;

import ma.ismo.crjj.util.HibernateUtil;

public class IDAO_Immeuble implements IDao<Immeuble> {

	@Override
	public List<Immeuble> getAll() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		org.hibernate.Transaction tr = session .beginTransaction(); 
		
		List<Rue> etr=session.createQuery("from Immeuble").getResultList();
		
		tr.commit();
		session.close();
		return etr;
	}

	@Override
	public Immeuble getOne(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		org.hibernate.Transaction t = session.beginTransaction();

		Immeuble Immeublee = session.get(Immeuble.class, id);

		t.commit();
		session.close();
		return Immeublee;
	}

	@Override
	public boolean save(Immeuble obj) {
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
	public boolean update(Immeuble obj) {
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
	public boolean delete(Immeuble obj) {
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
