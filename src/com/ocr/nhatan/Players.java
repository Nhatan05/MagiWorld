package com.ocr.nhatan;

import java.util.Scanner;

    public abstract class Players {
        protected int level;
        protected int life;
        protected int force;
        protected int agility;
        protected int intelligence;
        protected int numberOfPlayer;


        private Scanner sc = new Scanner(System.in);

        public Players(int level, int force, int agility, int intelligence, int numberOfPlayer) {
            this.level = level;
            this.life = level*5;
            this.force = force;
            this.agility = agility;
            this.intelligence = intelligence;
            this.numberOfPlayer = numberOfPlayer;
        }

        public int getLevel() {
            return level;
        }

        public int getLife() {
            return life;
        }

        public int getForce() {
            return force;
        }

        public int getAgility() {
            return agility;
        }

        public int getIntelligence() {
            return intelligence;
        }

        public int getNumberOfPlayer() {
            return numberOfPlayer;
        }

        // ---- Setters ----

        public void setLevel(int level) {
            this.level = level;
        }

        public void setLife(int life) {
            this.life = life;
        }

        public void setForce(int force) {
            this.force = force;
        }

        public void setAgility(int agility) {
            this.agility = agility;
        }

        public void setIntelligence(int intelligence) {
            this.intelligence = intelligence;
        }

        public void setNumberOfPlayer(int numberOfPlayer) {
            this.numberOfPlayer = numberOfPlayer;
        }

        // ---- Class methods ----

        /**
         * Method for remove life after an attack
         * @param damage the amount of damage
         */
        public void coup(int damage){
            int currentLife = getLife();
            System.out.println("Joueur " + getNumberOfPlayer() + " perd " + damage + " points de vie");
            setLife(currentLife - damage);
            if(getLife() <= 0){
                System.out.println("Joueur " + getNumberOfPlayer() + " est mort");
            }
        }

        /**
         * Method for add life when soin is used
         * @param health the amount of life
         */
        public void soin(int health){
            System.out.println("Joueur " + getNumberOfPlayer() + " utilise Soin et gagne " + health + " en vitalité.");
            setLife(getLevel() + health);
        }

        /**
         * Method for add agility
         * @param agility the amount of agility
         */
        public void concentration(int agility){
            System.out.println("Joueur " + getNumberOfPlayer() + " utilise Concentration et gagne " + agility + " en agilité.");
            setAgility(getAgility() + agility);
        }

        // ---- Abstract methods ----

        /**
         * Abstract method used for return the scream of the inherited Personnage
         */
        public abstract String cri();

        /**
         * Abstract method used for return the inherited attack 1
         */
        public abstract void attaqueBasique(Players p);

        /**
         * Abstract method used the return the inherited attack 2
         */
        public abstract void attaqueSpeciale(Players p);


        // ---- toString ----

        /**
         * Method toString who describe the personnage
         * @return the description sentence of the created personnage
         */
        @Override
        public String toString() {
            return cri() + " je suis le " + getClass().getSimpleName() + " Joueur " + getNumberOfPlayer()
                    + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getForce() + " de force, "
                    + getAgility() + " d'agilité et " + getIntelligence() + " d'intélligence !";
        }
    }
