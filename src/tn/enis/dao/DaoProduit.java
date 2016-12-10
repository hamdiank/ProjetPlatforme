package tn.enis.dao;

import java.math.BigDecimal;

import tn.enis.model.Categoris;
import tn.enis.model.Produit;

public interface DaoProduit extends DaoGenerique <Produit,BigDecimal>{
	public Produit findByProduit(Categoris categori); 
}
