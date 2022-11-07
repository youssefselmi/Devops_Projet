
package com.esprit.examen.services;


import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

//import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.extern.slf4j.Slf4j;
import com.esprit.examen.entities.Stock;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;





//@TestMethodOrder(OrderAnnotation.class)
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class StockServiceImplTest {

	@Autowired
	IStockService iStockService;
	

	
	@Test
	public void testAddStock() {

		List<Stock> stocks = iStockService.retrieveAllStocks();
		int expected=stocks.size();
		Stock s = new Stock();
		s.setLibelleStock("stock test");
		s.setQte(11);
		s.setQteMin(1001);
		Stock savedStock= iStockService.addStock(s);
		assertEquals(expected+1, iStockService.retrieveAllStocks().size());
		assertNotNull(savedStock.getLibelleStock());


	} 
	/*
	
	@Test
	public void testDeleteStock()
	{
		iStockService.deleteStock(2L);
		assertNull(iStockService.retrieveStock(2L));
	}
	

	@Test
	public void testRetrieveAllStocks()
	{
		List<Stock> stocks = iStockService.retrieveAllStocks();
		assertEquals(2,stocks.size());
	}
	

	@Test
	public void testRetrieveStock()
	{
		Stock stock = iStockService.retrieveStock(3L);
		assertEquals(3L,stock.getIdStock().longValue());
		
	}
	
	
	@Test
	public void testUpdateStock()
	{
		Stock s = new Stock();
		s.setIdStock(1L);
		s.setLibelleStock("stock test");
		s.setQte(500);
		s.setQteMin(5000);
		Stock updatedStock=iStockService.updateStock(s);
		assertEquals(s.getLibelleStock(),updatedStock.getLibelleStock());
	}
	
	*/
	
	
	



	
	

	
	

}
