package com.ocr.nhatan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GuerrierTest {

        Guerrier g1 = new Guerrier(10, 10, 0, 0, 1);
        Guerrier g2 = new Guerrier(10, 10, 0, 0, 2);

        @Test
        public void Given_GuerrierSelected_When_PlayersCreation_Then_DisplayTheScreamWord(){
            System.out.println(g1.cri());
            assertEquals("Woarg", g1.cri());
        }

    @Test
    public void Given_AttaqueBasiqueSelected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToPlayers2WithoutChangeLifeOfPersonnage1(){
        g1.attaqueBasique(g2);
        assertEquals(40,g2.getLife());
        assertEquals(50,g1.getLife());
    }

    @Test
    public void Given_AttaqueSpecialeSelected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToPlayers2WithLooseLifeOfPersonnage1(){
        g1.attaqueSpeciale(g2);
        assertEquals(30,g2.getLife());
        assertEquals(45,g1.getLife());
    }


}
