package org.gestionStockProduit.service;

import java.util.List;

import org.gestionStockProduit.entity.entuty.Produit;

public interface IproduitService {
	
	List<Produit>  getProduit();
	
	void addProduit(Produit produit);
	
	void updateProduit(Produit produit);
	
	void deleteProduit(String ref);

}
