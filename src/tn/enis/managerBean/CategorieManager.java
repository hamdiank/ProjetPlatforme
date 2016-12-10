package tn.enis.managerBean;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

import tn.enis.model.Categoris;
import tn.enis.service.CategorieServiceImpl;

@ManagedBean(value="categorieManager")
@RequestScoped
public class CategorieManager {

	Categoris cat;
	CategorieServiceImpl catServic;

	public CategorieManager() {
		super();
		cat = new Categoris();
		// catServic = new CategorieServiceImpl();
	}

	
	
	
	
	
}
