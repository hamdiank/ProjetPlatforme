package tn.enis.managerBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import tn.enis.model.Client;
import tn.enis.service.ClientServiceImpl;

@ManagedBean
@ViewScoped
public class ClientManager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Client client;
	private ClientServiceImpl clientservice;
	private List<Client> listclient ; 

	public ClientManager() {
		super();
		client = new Client();
		clientservice = new ClientServiceImpl();
		setListclient(getListClient()) ; 
	}

	public void addclient() {
		clientservice.ajouter(client);
	}

	public void deletClient() {
		FacesContext fc = FacesContext.getCurrentInstance() ; 
		HttpServletRequest  request = (HttpServletRequest) fc.getExternalContext().getRequest() ; 
		 int idcat = Integer.parseInt(request.getParameter("clientsup"));
		 client.setId_client(idcat);
		clientservice.supprimer(client);
	}

	public void updateclient(Client c) {
		clientservice.modifier(c);
	}

	public List<Client> getListClient() {
		return clientservice.getistClient();
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ClientServiceImpl getClientservice() {
		return clientservice;
	}

	public void setClientservice(ClientServiceImpl clientservice) {
		this.clientservice = clientservice;
	}

	public List<Client> getListclient() {
		return listclient;
	}

	public void setListclient(List<Client> listclient) {
		this.listclient = listclient;
	}

}
