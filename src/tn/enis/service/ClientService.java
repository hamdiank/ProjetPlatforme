package tn.enis.service;

import java.util.List;

import tn.enis.model.Client;

public interface ClientService {
	public void ajouter(Client c) ; 
	public void modifier(Client c) ;  
	public void supprimer(Client c) ; 
	public List<Client> getistClient() ; 

}
