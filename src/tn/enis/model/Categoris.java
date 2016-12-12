package tn.enis.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIE")
public class Categoris {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "id_categorie", nullable = false, unique = true)
	private Integer codeCategorie;
	private String nom;
	private boolean editable ; 
	private String description;
	private Date dateAjout;
	@OneToMany
	@JoinColumn(name="id_produit")
	private List<Produit> produits;

	public Categoris() {
		super();
	}

	public Categoris(String nom, String description, Date dateAjout) {
		super();
		this.nom = nom;
		this.description = description;
		this.dateAjout = dateAjout;
	}

	public Integer getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(Integer codeCategorie) {
		this.codeCategorie = codeCategorie;
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

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	

}
