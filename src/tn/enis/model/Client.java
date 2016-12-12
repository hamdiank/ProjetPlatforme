package tn.enis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Client {
	@Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id_client ; 
	public void setId_client(long id_client) {
		this.id_client = id_client;
	}
	private String nom_client ; 
	private String prenom_client ; 
	private long cin ; 
	private String adresse ; 
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	public String getPrenom_client() {
		return prenom_client;
	}
	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}
	public long getCin() {
		return cin;
	}
	public void setCin(long cin) {
		this.cin = cin;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public long getId_client() {
		return id_client;
	}
	public Client(String nom_client, String prenom_client, long cin, String adresse) {
		super();
		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.cin = cin;
		this.adresse = adresse;
	}
	public Client() {
		super();
	}
	

	
	
	
}
