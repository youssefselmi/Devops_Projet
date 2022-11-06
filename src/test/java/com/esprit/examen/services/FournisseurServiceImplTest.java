
package com.esprit.examen.services;

import com.esprit.examen.repositories.FournisseurRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.esprit.examen.entities.Fournisseur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FournisseurServiceImplTest {
    @Mock
    FournisseurRepository fournisseurRepository;

    @InjectMocks
    FournisseurServiceImpl fournisseurServiceImpl;

    Fournisseur fournisseur = new Fournisseur("1243","testing");
    Fournisseur fournisseur1 = new Fournisseur("1243","testing");

    List<Fournisseur> list = new ArrayList<Fournisseur>() {
        {
            add(fournisseur1);
            add(fournisseur);
        }
    };


    @Test
    void testRetrieveFournisseur() {
        Mockito.when(fournisseurRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(fournisseur));
        Fournisseur op1 = fournisseurServiceImpl.retrieveFournisseur(1L);
        Assertions.assertNotNull(op1);
    }


    @Test
    void updateFournisseurTest() {
        fournisseur.setCode("7050");
        Assertions.assertNotNull(fournisseurServiceImpl.updateFournisseur(fournisseur));
    }

    @Test
    void deleteFournisseurTest() {
        fournisseurServiceImpl.deleteFournisseur(
                fournisseur1.getIdFournisseur());
        Assertions.assertNotNull(list);
    }
}
