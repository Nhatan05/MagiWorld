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

    /**
     * cette méthode permet au Guerrier d'effectuer un dommage égal à la force du joueur sur l'adversaire
     * @param p est un objet de type players
     */

    @Override
    public void attaqueBasique(Players p) {
        int damage = getForce();
        System.out.println("Joueur " + getNumberOfPlayer() + " utilise Coup d'Epee et inflige " + damage + " dommages.");
        p.coup(damage);
    }

    /**
     * cette méthode est le coup de rage du Guerrier
     * @param p
     */
    @Override
    public void attaqueSpeciale(Players p) {
        int damage = getForce() * 2;
        int autoDamage = getForce() / 2;
        System.out.println("Joueur " + getNumberOfPlayer() + " utilise Coup de rage et inflige " + damage + " dommages.");
        p.coup(damage);
        coup(autoDamage);
    }

}
