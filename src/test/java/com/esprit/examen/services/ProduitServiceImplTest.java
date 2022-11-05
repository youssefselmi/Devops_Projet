package com.esprit.examen.services;

import com.esprit.examen.repositories.ProduitRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.esprit.examen.entities.Produit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProduitServiceImplTest {
	@Mock
	ProduitRepository produitRepository;

	@InjectMocks
	ProduitServiceImpl produitServiceImpl;

	Produit produit = new Produit("jalel1", "pc" , 12 ,new Date() );
	Produit produit1 = new Produit("jalel2", "game" , 90 ,new Date() );
	Produit produit2 = new Produit("jalel3", "phone" , 15 ,new Date() );
	List<Produit> list = new ArrayList<Produit>() {
		{
			add(produit1);
			add(produit2);
		}
	};



	@Test
	void testRetrieveProduit() {
		Mockito.when(produitRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(produit));
		Produit prod1 = produitServiceImpl.retrieveProduit(1L);
		Assertions.assertNotNull(prod1);
	}


	@Test
	void updateProduitTest(){
		produit.setLibelleProduit("Libelle 1 updated");
		Assertions.assertNotNull(produitServiceImpl.updateProduit(produit));
	}
	@Test
	void deleteProduitTest(){
		produitServiceImpl.deleteProduit(
				produit2.getIdProduit());
		Assertions.assertNotNull(list);
	}
}
