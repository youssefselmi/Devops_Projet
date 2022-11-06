

package com.esprit.examen.services;

import com.esprit.examen.repositories.OperateurRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.esprit.examen.entities.Operateur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperateurServiceImplTest {
    @Mock
    OperateurRepository operateurRepository;

    @InjectMocks
    OperateurServiceImpl operateurServiceImpl;

    Operateur operateur = new Operateur("amir", "mohamed","aaa" );
    Operateur operateur1 = new Operateur("ahmed", "med" ,"lll" );

    List<Operateur> list = new ArrayList<Operateur>() {
        {
            add(operateur1);
            add(operateur);
        }
    };



    @Test
    void testRetrieveOperateur() {
        Mockito.when(operateurRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(operateur));
        Operateur op1 = operateurServiceImpl.retrieveOperateur(1L);
        Assertions.assertNotNull(op1);
    }


    @Test
    void updateOperateurTest(){
        operateur.setPrenom("amir updated");
        Assertions.assertNotNull(operateurServiceImpl.updateOperateur(operateur));
    }
    @Test
    void deleteOperateurTest(){
        operateurServiceImpl.deleteOperateur(
                operateur1.getIdOperateur());
        Assertions.assertNotNull(list);
    }
}

