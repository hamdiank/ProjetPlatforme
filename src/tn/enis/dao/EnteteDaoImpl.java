package tn.enis.dao;

import java.math.BigDecimal;

import org.hibernate.Session;

import tn.enis.model.EntetFacture;

public class EnteteDaoImpl extends DaoGenHibernateIml<EntetFacture, BigDecimal> implements DaoEnteteF{

	@Override
	public EntetFacture findByIdClient(Long id) {
		Session hibernateSession = this.getSession();
		EntetFacture entetFacture = (EntetFacture) hibernateSession.get(EntetFacture.class,id);
		return entetFacture;
	}
	

}
