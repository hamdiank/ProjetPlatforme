package tn.enis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUIT")
public class Produit {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "id_produit", nullable = false, unique = true)
	private int codeProduit;
	private String nom;
	private String description;
	private Double prix;
	private int quantiteStock;
	@ManyToOne
	private Categoris categorie;

	public Produit() {
		super();
	}

	public Produit(String nom, String description, Double prix, int quantiteStock) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.quantiteStock = quantiteStock;
	}

	public int getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(int codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public Categoris getCategorie() {
		return categorie;
	}

	public void setCategorie(Categoris categorie) {
		this.categorie = categorie;
	}

}
