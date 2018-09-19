package com.ocr.nhatan;

public class Mage extends Players {
    private int defaultLife;

    public Mage(int level, int force, int agility, int intelligence, int numberOfPlayer) {
        super(level, force, agility, intelligence, numberOfPlayer);
        this.defaultLife = level*5;
    }

    /**
     * cri spécifique au Mage quand il début le jeux
     * @return Abracadabra
     */

    @Override
    public String cri() {
        return "Abracadabra";
    }

    /**
     * méthode permettant au mage d'infliger des domages égaux à son intelligence sur l'adversaire
     * @param p objet de type Players
     */

    @Override
    public void attaqueBasique(Players p) {
        int damage = getIntelligence();
        System.out.println("Joueur " + getNumberOfPlayer() + " utilise Boule de Feu et inflige " + damage + " dommages.");
        p.coup(damage);
    }

    /**
     * cette méthode permet au mage d'augmenter sa vie l'équivalent du double de son intelligence
     * @param p
     */

    @Override
    public void attaqueSpeciale(Players p) {
        int health = getIntelligence() * 2;
        if(getLife() + health >= defaultLife){
            health = defaultLife - getLife();
            soin(health);
        }
        else
            soin(health);
    }
}
