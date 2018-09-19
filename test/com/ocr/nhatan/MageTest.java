package com.ocr.nhatan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MageTest {

    Mage m1 = new Mage(10, 0, 0, 10, 1);
    Mage m2 = new Mage(10, 0, 0, 10, 2);

    @Test
    public void Given_MzgeSelected_When_PlayersCreation_Then_DisplayTheScreamWord(){
        System.out.println(m1.cri());
        assertEquals("Abracadabra", m1.cri());
    }

    @Test
    public void Given_AttaqueBasiqueSelected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToPlayers2WithoutChangeLifeOfPersonnage1(){
        m1.attaqueBasique(m2);
        assertEquals(40,m2.getLife());
        assertEquals(50,m1.getLife());
    }

    @Test
    public void Given_AttaueSpecialeSelectedWithFullLife_When_PlayerTurn_Then_DisplayMessageFor0LifeGiven(){
        m1.attaqueSpeciale(m2);
        assertEquals(50,m1.getLife());
    }

    @Test
    public void Given_AttaqueSpecialeSelectedWithFullLife_When_PlayerTurn_Then_DisplayMessageFor20LifeGiven(){
        m1.setLife(43);
        m1.attaqueSpeciale(m2);
        assertEquals(50,m1.getLife());
    }


}
