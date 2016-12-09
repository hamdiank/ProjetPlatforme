package tn.enis.service;

import java.util.ArrayList;

import tn.enis.model.Categoris;



public interface CategorieService  {
	void ajouter(Categoris categ);

	void modifier(Categoris categ);

	void supprimer(Categoris categ);

	Categoris retourner(Integer key);

	ArrayList<Categoris> listeCategorie();
}
