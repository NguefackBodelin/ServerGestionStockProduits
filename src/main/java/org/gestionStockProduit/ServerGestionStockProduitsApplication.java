package org.gestionStockProduit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "org.gestionStockProduit")
public class ServerGestionStockProduitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerGestionStockProduitsApplication.class, args);
		
//		ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
//		
//		produitRepository.save(new Produit("Livre",50,20));
//		produitRepository.save(new Produit("Cahier",200,5.25));
//		produitRepository.save(new Produit("Crayon",50,220.25));
//		produitRepository.save(new Produit("Stylo",500,2.10));
	}

}
