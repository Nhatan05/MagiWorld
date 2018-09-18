package com.ocr.nhatan;

public class Guerrier extends Players{

    public Guerrier(int level, int force, int agility, int intelligence, int numberOfPlayer) {
        super(level, force, agility, intelligence, numberOfPlayer);
    }

    /**
     * il s'agit du cri du guerrier quand il commence la partie
     * @return woarg
     */

    @Override
    public String cri() {
        return "Woarg";
    }
}
