package tn.enis.controller;

import javax.annotation.ManagedBean;

import tn.enis.model.Categoris;
import tn.enis.service.CategorieServiceImpl;

@ManagedBean(value="categorieManager")
public class CategorieManager {

	Categoris cat;
	CategorieServiceImpl catServic;

	public CategorieManager() {
		super();
		cat = new Categoris();
	//	catServic = new CategorieServiceImpl();
	}

	
	
	
	
	
}
