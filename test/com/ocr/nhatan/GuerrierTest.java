package com.ocr.nhatan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GuerrierTest {

        Guerrier g1 = new Guerrier(10, 10, 0, 0, 1);
        Guerrier g2 = new Guerrier(10, 10, 0, 0, 2);

        @Test
        public void Given_GuerrierSelected_When_PersonnageCreation_Then_DisplayTheScreamWord(){
            System.out.println(g1.cri());
            assertEquals("Woarg", g1.cri());
        }
    
}
