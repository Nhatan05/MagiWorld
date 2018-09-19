package com.ocr.nhatan;

public class Rodeur extends Players {

    public Rodeur(int level, int force, int agility, int intelligence, int numberOfPlayer) {
        super(level, force, agility, intelligence, numberOfPlayer);
    }

    /**
     * ici c'est un cri spécifique au  Rodeur quand il commence le jeux
     * @return cruinnnggg
     */

    @Override
    public String cri() {
        return "cruinnnggg";
    }

    /**
     * cette méthode permet au Rodeur de tirer à l'arc pour infliger des domages à son adversaire
     * @param p
     */

    @Override
    public void attaqueBasique(Players p) {
        int damage = getAgility();
        System.out.println("Joueur " + getNumberOfPlayer() + " utilise Tir à l'Arc et inflige " + damage + " dommages.");
        p.coup(damage);
    }

    /**
     * ici le Rodeur gagne la moitié de  son niveau en agilité
     * @param p
     */
    @Override
    public void attaqueSpeciale(Players p) {
        int agilityWon = getLevel() / 2;
        concentration(agilityWon);
    }
}
