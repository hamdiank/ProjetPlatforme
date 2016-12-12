package tn.enis.managerBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import tn.enis.model.Produit;
import tn.enis.service.ProduitServiceImpl;

@ManagedBean
@ViewScoped
public class ProduitManager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Produit produit;
	private ProduitServiceImpl produitserv;
	private List<Produit> listproduit ; 
	private CategorieManager categoriemanager ; 

	public ProduitManager() {
		super();
		produit = new Produit();
		produitserv = new ProduitServiceImpl();
		setListproduit(getListProduit()) ;
		setCategoriemanager(new CategorieManager()) ;
	}

	public void addProduit() {
		produitserv.ajouter(produit);
	}

	public void deletProduit() {
		FacesContext fc = FacesContext.getCurrentInstance() ; 
		HttpServletRequest  request = (HttpServletRequest) fc.getExternalContext().getRequest() ; 
		 int idcat = Integer.parseInt(request.getParameter("produitsup"))  ;
		produit.setCodeProduit(idcat);
		produitserv.supprimer(produit);
	}

	public void updateProd(Produit p) {
		produitserv.modifier(p);
	}

	public List<Produit> getListProduit() {
		return produitserv.listeProduit();
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public ProduitServiceImpl getProduitserv() {
		return produitserv;
	}

	public void setProduitserv(ProduitServiceImpl produitserv) {
		this.produitserv = produitserv;
	}

	public List<Produit> getListproduit() {
		return listproduit;
	}

	public void setListproduit(List<Produit> listproduit) {
		this.listproduit = listproduit;
	}

	public CategorieManager getCategoriemanager() {
		return categoriemanager;
	}

	public void setCategoriemanager(CategorieManager categoriemanager) {
		this.categoriemanager = categoriemanager;
	}

}
