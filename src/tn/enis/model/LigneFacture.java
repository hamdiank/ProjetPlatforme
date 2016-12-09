package tn.enis.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class LigneFacture {
	@OneToOne
	@JoinColumn(name="id_entetFacture")
	private EntetFacture entetFacture ;
	@OneToOne
	@JoinColumn(name="id_produit")
	private Produit produit ; 
	
	private double qauntite ;

	public EntetFacture getEntetFacture() {
		return entetFacture;
	}

	public void setEntetFacture(EntetFacture entetFacture) {
		this.entetFacture = entetFacture;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public double getQauntite() {
		return qauntite;
	}

	public void setQauntite(double qauntite) {
		this.qauntite = qauntite;
	}

	public LigneFacture(EntetFacture entetFacture, Produit produit, double qauntite) {
		super();
		this.entetFacture = entetFacture;
		this.produit = produit;
		this.qauntite = qauntite;
	}

	public LigneFacture() {
		super();
	} 
	
	
	
}
