package tn.enis.service;

import java.util.ArrayList;

import tn.enis.model.Produit;

public interface ProduitService  {
	void ajouter(Produit prod);

	void modifier(Produit prod);

	void supprimer(Produit prod);

	ArrayList<Produit> listeProduit();
}
