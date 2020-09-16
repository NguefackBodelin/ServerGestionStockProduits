package org.gestionStockProduit.service;

import java.util.ArrayList;
import java.util.List;

import org.gestionStockProduit.entity.Produit;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("produitMockServiceImpl")
public class ProduitMockServiceImpl implements IproduitService{

	private List<Produit> produits;

	public ProduitMockServiceImpl() {
		 produits = new ArrayList<Produit>();

			produits.add(new Produit("Livre",50,20));
			produits.add(new Produit("Cahier",200,5.25));
			produits.add(new Produit("Crayon",50,220.25));
			produits.add(new Produit("Stylo",500,2.10));
	}

	@Override
	public List<Produit> getProduit() {
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		boolean isUpdate = false;
		for(Produit prod:produits) {
			if(produit.getRef() == prod.getRef()) {
				prod.setRef(produit.getRef());
				prod.setPrixUnitaire(produit.getPrixUnitaire());
				prod.setQuantite(produit.getQuantite());
				isUpdate=true;
			}
		}
		if(isUpdate==false) {
			System.out.println("elemento non esiste nel sistema");
		}

	}

	@Override
	public void deleteProduit(Long id) {
		Produit prod =new Produit();
		prod.setId(id);
		for(Produit produit:produits) {
			if(prod.equals( produit)) {
				produits.remove(produit);
			}
		}
	}

}
