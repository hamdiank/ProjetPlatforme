package tn.enis.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public E findByID(Class clazz, Integer id) {
		Session hibernateSession = this.getSession();
		E t = null;
		t = (E) hibernateSession.get(clazz, id);
		return t;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<E> findAll(Class clazz) {
		Session hibernateSession = this.getSession();
		List<E> T = null;
		Query query = hibernateSession.createQuery("from " + clazz.getName());
		T = (List<E>) query.list();
		return T;
	}

}
