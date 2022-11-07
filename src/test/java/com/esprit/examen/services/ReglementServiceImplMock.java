/*package com.esprit.examen.services;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import com.esprit.examen.entities.Reglement;

import com.esprit.examen.repositories.ReglementRepository;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class ReglementServiceImplMock {

	
	@Mock
	ReglementRepository reglementRepository;

	@InjectMocks
	ReglementServiceImpl reglementService;
	
	
    private Reglement reglement1 = new Reglement(1L,22, 4, false,new Date(),null);
    private Reglement reglement2 = new Reglement(2L,22, 0, true,new Date(),null);

   
    @Test
    public void MockAddReglement() {
        when(reglementRepository.save(reglement1)).thenReturn(reglement1);
        assertNotNull(reglement1);
        assertEquals(reglement1, reglementService.addReglement(reglement1));
        log.info("add works !!");
    }
    @Test
    public void TestRetrieveAllReglements() {
        when(reglementRepository.findAll()).thenReturn(Stream
                .of(reglement1,reglement2)
                .collect(Collectors.toList()));
        assertEquals(2,reglementService.retrieveAllReglements().size());
        log.info("Retrieve reglements works !");
    }


    @Test
    public void TestRetrieveReglement() {
        when(reglementRepository.findById(reglement1.getIdReglement())).thenReturn(Optional.of(reglement1));
        assertEquals(reglement1, reglementService.retrieveReglement(reglement1.getIdReglement()));
        log.info("Retrieve works !!");
    }
	
}
*/