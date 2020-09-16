package org.gestionStockProduit.service;

import java.util.List;

import org.gestionStockProduit.entity.Produit;
import org.gestionStockProduit.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
@Component("produitService")
public class ProduitService implements IproduitService{

	@Autowired(required=false)
	private ProduitRepository produitRepository;
	
	@Override
	public List<Produit> getProduit() {
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		produitRepository.save(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit = new Produit();
		produit.setId(id);
		produitRepository.delete(produit);
		
	}

}
