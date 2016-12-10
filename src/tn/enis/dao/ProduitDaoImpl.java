package tn.enis.dao;

import java.math.BigDecimal;

import org.hibernate.Session;

import tn.enis.model.Categoris;
import tn.enis.model.Produit;

public class ProduitDaoImpl extends DaoGenHibernateIml<Produit, BigDecimal> implements DaoProduit{

	@Override
	public Produit findByProduit(Categoris categori) {
		Session hibernateSession = this.getSession();
		Produit produit = (Produit) hibernateSession.find(Produit.class,categori);
		return produit;
	}

}

