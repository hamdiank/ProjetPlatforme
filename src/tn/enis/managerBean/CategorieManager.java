package tn.enis.managerBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.enis.dao.CategorieDaoImpl;
import tn.enis.model.Categoris;
import tn.enis.service.CategorieServiceImpl;


@ManagedBean
@ViewScoped
public class CategorieManager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private  Categoris categorie ;
	 private    CategorieServiceImpl catServic;
	 private List<Categoris> listcategorie ; 

	public CategorieManager() {
		categorie = new Categoris();
		catServic = new CategorieServiceImpl(new CategorieDaoImpl());
		setListcategorie(catServic.listeCategorie()) ; 
	}
	
	public void addCategorie(){
		Date date  =new Date(System.currentTimeMillis()) ;
		categorie.setDateAjout(date);
		catServic.ajouter(categorie);
		setListcategorie(catServic.listeCategorie()) ; 
	}
	

	public Categoris getCategorie() {
		return categorie;
	}

	public void setCategorie(Categoris categorie) {
		this.categorie = categorie;
	}

	public CategorieServiceImpl getCatServic() {
		return catServic;
	}

	public void setCatServic(CategorieServiceImpl catServic) {
		this.catServic = catServic;
	}

	public List<Categoris> getListcategorie() {
		return listcategorie;
	}

	public void setListcategorie(List<Categoris> listcategorie) {
		this.listcategorie = listcategorie;
	}
	
	
	

	
	
	
	
	
}
