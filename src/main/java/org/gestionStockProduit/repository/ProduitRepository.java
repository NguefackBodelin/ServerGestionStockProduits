package org.gestionStockProduit.repository;

import org.gestionStockProduit.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//pourkon puisse l'injecter dans les services 
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
