package com.ocr.nhatan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RodeurTest {

    Rodeur r1 = new Rodeur(10, 0, 10, 0, 1);
    Rodeur r2 = new Rodeur(10, 0, 10, 0, 2);

    @Test
    public void Given_GuerrierSelected_When_PersonnageCreation_Then_DisplayTheScreamWord(){
        System.out.println(r1.cri());
        assertEquals("Fsshhh", r1.cri());
    }

    @Test
    public void Given_Attack1Selected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToPersonnage2WithoutChangeLifeOfPersonnage1(){
        r1.attaqueBasique(r2);
        assertEquals(40,r2.getLife());
        assertEquals(50,r1.getLife());
    }

    @Test
    public void Given_Attack2Selected_When_PlayerTurn_Then_CorrectAmountOfAddAgility(){
        r1.attaqueSpeciale(r2);
        assertEquals(15,r1.getAgility());

    }


}
