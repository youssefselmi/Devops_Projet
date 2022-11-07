/*package com.esprit.examen.services;	
	import org.junit.jupiter.api.extension.ExtendWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.junit.jupiter.MockitoExtension;
	
	import lombok.extern.slf4j.Slf4j;
	import org.junit.Test;
	//import org.junit.jupiter.api.Test;
	import com.esprit.examen.entities.Stock;
	import com.esprit.examen.repositories.StockRepository;
	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertNotNull;
	
	import static org.mockito.Mockito.times;
	import static org.mockito.Mockito.verify;
	import static org.mockito.Mockito.when;
	
	
	
	import java.util.Optional;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;
	
	@Slf4j
	@ExtendWith(MockitoExtension.class)
	public class StockServiceImpMock {
	
		
		@Mock
		StockRepository stockRepository;
	
		@InjectMocks
		StockServiceImpl stockService;
		
		
	    private Stock stock1 = new Stock(1L,"stock Mock1", 100, 1,null);
	    private Stock stock2 = new Stock(2L,"stock Mock2", 200, 2,null);
	
	   
	    @Test
	    public void MockAddStock() {
	        when(stockRepository.save(stock1)).thenReturn(stock1);
	        assertNotNull(stock1);
	        assertEquals(stock1, stockService.addStock(stock1));
	        log.info("add works !!");
	    }
	    @Test
	    public void TestRetrieveAllStocks() {
	        when(stockRepository.findAll()).thenReturn(Stream
	                .of(stock1,stock2)
	                .collect(Collectors.toList()));
	        assertEquals(2,stockService.retrieveAllStocks().size());
	        log.info("Retrieve stocks works !");
	    }
	    @Test
	    public void TestDeleteStock() {
	        stockRepository.save(stock1);
	        stockService.deleteStock(stock1.getIdStock());
	        verify(stockRepository, times(1)).deleteById(stock1.getIdStock());
	        log.info("Delete works !");
	    }
	    @Test
	    public void TestUpdateStock() {
	        when(stockRepository.save(stock1)).thenReturn(stock1);
	        assertNotNull(stock1);
	        assertEquals(stock1, stockService.updateStock(stock1));
	        log.info("Update works !!");
	    }
	    @Test
	    public void TestRetrieveStock() {
	        when(stockRepository.findById(stock1.getIdStock())).thenReturn(Optional.of(stock1));
	        assertEquals(stock1, stockService.retrieveStock(stock1.getIdStock()));
	        log.info("Retrieve works !!");
	    }
		
	}*/
