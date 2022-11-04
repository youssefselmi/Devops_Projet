package com.esprit.examen.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.esprit.examen.entities.Produit;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProduitServiceImplTest {
	@Autowired
	IProduitService stockService;
	
	@Test
	public void testAddProduit() {
	//	List<Produit> stocks = stockService.retrieveAllProduits();
	//	int expected=stocks.size();
		Produit s = new Produit("stock test",10,100);
		Produit savedProduit= stockService.addProduit(s);
		
	//	assertEquals(expected+1, stockService.retrieveAllProduits().size());
		assertNotNull(savedProduit.getLibelleProduit());
		stockService.deleteProduit(savedProduit.getIdProduit());
		
	} 
	
	@Test
	public void testAddProduitOptimized() {

		Produit s = new Produit("stock test",10,100);
		Produit savedProduit= stockService.addProduit(s);
		assertNotNull(savedProduit.getIdProduit());
		assertSame(10, savedProduit.getIdProduit());
		//assertTrue(savedProduit.getQteMin()>0);
		stockService.deleteProduit(savedProduit.getIdProduit());
		
	} 
	
	@Test
	public void testDeleteProduit() {
		Produit s = new Produit("stock test",30,60);
		Produit savedProduit= stockService.addProduit(s);
		stockService.deleteProduit(savedProduit.getIdProduit());
		assertNull(stockService.retrieveProduit(savedProduit.getIdProduit()));
	}

}
