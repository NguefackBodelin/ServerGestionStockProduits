package org.gestionStockProduit.controller;

import java.util.List;

import org.gestionStockProduit.entity.Produit;
import org.gestionStockProduit.service.IproduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {

	@Autowired
	@Qualifier("produitService")
	private IproduitService produitService; 
	
	@GetMapping
	public List<Produit> getProduit(){
		return produitService.getProduit();
	}
	
	@PostMapping
	public void addProduit(@RequestBody Produit produit) {
		produitService.addProduit(produit);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody Produit produit) {
		produitService.updateProduit(produit);;
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
		produitService.deleteProduit(id);
	}
}
