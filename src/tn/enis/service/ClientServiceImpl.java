package tn.enis.service;

import java.util.List;

import tn.enis.dao.ClientDaoImpl;
import tn.enis.model.Client;

public class ClientServiceImpl implements ClientService{
	private ClientDaoImpl client ; 
	
	

	public ClientServiceImpl() {
		super();
		client  = new ClientDaoImpl() ; 
	}

	@Override
	public void ajouter(Client c) {
		client.add(c);
		
	}

	@Override
	public void modifier(Client c) {
		client.update(c);
		
	}

	@Override
	public void supprimer(Client c) {
		client.remove(c);
		
	}

	@Override
	public List<Client> getistClient() {
		
		return  client.findAll(Client.class) ; 
	}

	public ClientDaoImpl getClient() {
		return client;
	}

	public void setClient(ClientDaoImpl client) {
		this.client = client;
	}

}
