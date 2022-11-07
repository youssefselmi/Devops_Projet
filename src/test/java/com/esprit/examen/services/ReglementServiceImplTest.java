package com.esprit.examen.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.extern.slf4j.Slf4j;
import com.esprit.examen.entities.Reglement;


//@TestMethodOrder(OrderAnnotation.class)
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class ReglementServiceImplTest {

	@Autowired
	IReglementService iReglementService;
	

	
	@Test
	public void testAddReglement() {

		List<Reglement> reglements = iReglementService.retrieveAllReglements();
		int expected=reglements.size();
		Reglement r = new Reglement();
		r.setMontantPaye(22);
		r.setMontantRestant(3);
		r.setPayee(false);
		Reglement savedReglement= iReglementService.addReglement(r);
		assertEquals(expected+1, iReglementService.retrieveAllReglements().size());
		assertNotNull(savedReglement.getMontantPaye());


	} 
	
	

	@Test
	public void testRetrieveAllReglements()
	{
		List<Reglement> reglements = iReglementService.retrieveAllReglements();
		assertEquals(4,reglements.size());
	}
	

	@Test
	public void testRetrieveReglement()
	{
		Reglement reglement = iReglementService.retrieveReglement(6L);
		assertEquals(6L,reglement.getIdReglement().longValue());
		
	}
	
	
	

	
	
	
	
	



	
	

	
	

}
