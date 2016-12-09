package tn.enis.controller;

import java.util.Date;

import tn.enis.dao.CategorieDaoImpl;
import tn.enis.model.Categoris;
import tn.enis.service.CategorieServiceImpl;

public class Test {
	public static void main(String[] args) {
		CategorieDaoImpl catimpl = new CategorieDaoImpl();
		CategorieServiceImpl cat=new CategorieServiceImpl(catimpl);
		cat.ajouter(new Categoris("Acer","descrpDell",new Date()));
		
	}

}
