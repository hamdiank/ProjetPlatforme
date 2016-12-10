package tn.enis.dao;

import java.math.BigDecimal;

import tn.enis.model.EntetFacture;

public interface DaoEnteteF extends DaoGenerique <EntetFacture,BigDecimal>{

	public EntetFacture findByIdClient(Long Id);
	
}
