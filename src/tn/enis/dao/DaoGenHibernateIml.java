package tn.enis.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tn.enis.utils.HibernateUtil;



public class DaoGenHibernateIml <E, PK extends Serializable> implements DaoGenerique<E, PK>{


	protected Session getSession() {
		return HibernateUtil.getSession().openSession();
	}
	@Override
	public void add(E entity) {
		Session hibernateSession = this.getSession();
		Transaction transaction = hibernateSession.beginTransaction();
		hibernateSession.save(entity);
		transaction.commit();
				
	}

	@Override
	public void update(E entity) {
		Session hibernateSession = this.getSession();
		Transaction transaction = hibernateSession.beginTransaction();
		hibernateSession.update(entity);
		transaction.commit();
				
	}

	@Override
	public void remove(E entity) {
		Session hibernateSession = this.getSession();
		Transaction transaction = hibernateSession.beginTransaction();
		hibernateSession.delete(entity);
		transaction.commit();
				
	}

	@Override
	public E find(PK key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
