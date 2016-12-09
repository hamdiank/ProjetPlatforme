package tn.enis.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table
public class EntetFacture {
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id_entefacture ; 
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_Fcture ;
	@OneToOne
	@JoinColumn(name="id_client")
	private Client client ; 
	
	
	
	public EntetFacture() {
		super();
	}
	public EntetFacture(Date date_Fcture, Client  id_client) {
		super();
		this.date_Fcture = date_Fcture;
		this.client = id_client;
	}
	public Date getDate_Fcture() {
		return date_Fcture;
	}
	public void setDate_Fcture(Date date_Fcture) {
		this.date_Fcture = date_Fcture;
	}
	public  Client getId_client() {
		return client;
	}
	public void setId_client(Client id_client) {
		this.client = id_client;
	}
	public long getId_entefacture() {
		return id_entefacture;
	}
	
	
	
	
}
