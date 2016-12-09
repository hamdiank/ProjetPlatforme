package tn.enis.service;

import java.util.ArrayList;

import tn.enis.dao.ProduitDaoImpl;
import tn.enis.model.Produit;

public class ProduitServiceImpl implements ProduitService {

	ProduitDaoImpl prods;
	

	public ProduitServiceImpl(ProduitDaoImpl prod) {
		super();
		this.prods = prod;
	}


	@Override
	public void ajouter(Produit prod) {
		prods.add(prod);
		
	}


	@Override
	public void modifier(Produit prod) {
		prods.update(prod);
		
	}


	@Override
	public void supprimer(Produit prod) {
		prods.remove(prod);
		
	}


	@Override
	public ArrayList<Produit> listeProduit() {
		// TODO Auto-generated method stub
		return null;
	}

}