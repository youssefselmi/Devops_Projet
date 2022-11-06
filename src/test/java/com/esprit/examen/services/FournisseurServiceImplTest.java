package com.esprit.examen.services;


import com.esprit.examen.entities.Fournisseur;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class FournisseurServiceImplTest {
    @Autowired
    IFournisseurService fs;

    @Test
    @Order(1)
    public void testRetrieveAllUsers(){
        List<Fournisseur> listFournisseurs = fs.retrieveAllFournisseurs();
        Assertions.assertEquals(0, listFournisseurs.size());
    }
}
