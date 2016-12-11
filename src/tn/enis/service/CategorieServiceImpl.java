package tn.enis.service;

import java.util.ArrayList;

import tn.enis.dao.CategorieDaoImpl;
import tn.enis.model.Categoris;

public class CategorieServiceImpl implements CategorieService {

	CategorieDaoImpl categorie ;
	
	
	
	public CategorieServiceImpl(CategorieDaoImpl categorie) {
		super();
		this.categorie = categorie;
	}

	@Override
	public void ajouter(Categoris categ) {
		categorie.add(categ);
		
	}

	@Override
	public void modifier(Categoris categ) {
		categorie.update(categ);;
		
	}

	@Override
	public void supprimer(Categoris categ) {
		categorie.remove(categ);
	}

	@Override
	public Categoris retourner(Integer key) {
		Categoris c = categorie.findByID(Categoris.class,key ) ; 
		return c;
	}

	@Override
	public ArrayList<Categoris> listeCategorie() {
		return  (ArrayList<Categoris>) categorie.findAll(Categoris.class);
		
	}

}
