package com.esprit.examen.services;

import com.esprit.examen.entities.Operateur;
import com.esprit.examen.repositories.FactureRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.esprit.examen.entities.Facture;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactureServiceImplTest {
    @Mock
    FactureRepository factureRepository;

    @InjectMocks
    FactureServiceImpl factureServiceImpl;

    Facture facture1 = new Facture(1, 10 , 60 ,new Date(),true );
    Facture facture2 = new Facture(2, 12 , 21 ,new Date(),false );
    Operateur operateur1 = new Operateur(1,"ahmed", "med" ,"lll" );

    List<Facture> list = new ArrayList<Facture>() {
        {
            add(facture1);
            add(facture2);
        }
    };



    @Test
    void testRetrieveFacture() {
        Mockito.when(factureRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(facture1));
        Facture fact1 = factureServiceImpl.retrieveFacture(1L);
        Assertions.assertNotNull(fact1);
    }


    @Test
    void cancelFactureTest(){

        Assertions.assertNotNull(factureServiceImpl.cancelFacture(facture1.getIdFacture()));
    }
    @Test
    void assignOperateurToFactureTest(){
        factureServiceImpl.assignOperateurToFacture(operateur1.getIdOperateur(),facture1.getIdFacture());

        Assertions.assertNotNull(list);
    }
}