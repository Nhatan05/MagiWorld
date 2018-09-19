package com.ocr.nhatan;

import java.util.Scanner;

public class Jeux {

    private Players player1;
    private Players player2;
    private Scanner sc = new Scanner(System.in);


    public Jeux(){
        player1 = ProfilJoueurs(1);

        player2 = ProfilJoueurs(2);

        Start();

    }


    /**
     * cette méthode permet au premier joueur et à son adversaire de choisir chacun leur personnage et leurs caractéristiques
     */
    private Players ProfilJoueurs(int numberOfPlayer){
        int classOfPlayer, level, force, agility, intelligence;
        System.out.println("Création du personnage du Joueur "+numberOfPlayer);
        do {
            System.out.println("Veuillez choisir la classe du personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            classOfPlayer = sc.nextInt();
            if (classOfPlayer <= 0 || classOfPlayer > 3 )
                System.out.println("Choix de classe erroné veuillez choisir un numéro valide !");
        }while (classOfPlayer <= 0 || classOfPlayer > 3);
        do {
            do {
                System.out.println("Niveau du personnage ?");
                level = sc.nextInt();
                if (level <= 0 || level > 100)
                    System.out.println("Niveau non valide faites un choix entre 1 et 100");
            }while (level <= 0 || level > 100);
            do {
                System.out.println("Force du personnage ?");
                force = sc.nextInt();
                if (force < 0 || force > 100)
                    System.out.println("Force non valide faites un choix entre 0 et 100");
            }while (force < 0 || force > 100);
            do {
                System.out.println("Agilité du personnage ?");
                agility = sc.nextInt();
                if (agility < 0 || agility > 100)
                    System.out.println("Agilité non valide faites un choix entre 0 et 100");
            }while (agility < 0 || agility > 100);
            do {
                System.out.println("Intelligence du personnage ?");
                intelligence = sc.nextInt();
                if (intelligence < 0 || intelligence > 100)
                    System.out.println("Intelligence non valide faites un choix entre 0 et 100");
            }while (intelligence < 0 || intelligence > 100);

            if ((force + agility + intelligence) != level )
                System.out.println("Caractéristique du Joueur erroné. l'addition de la Force , l'agilité et l'intelligence doit être égale au niveau du joueur. Réessayez !");
        }while ((force + agility + intelligence) != level);

        return choixPersonnage(classOfPlayer, level, force, agility, intelligence, numberOfPlayer);
    }


    /**
     * cette méthode permet d'associer le joueur et son comportement
     */
    private Players choixPersonnage(int classOfPlayer, int level, int force, int agility, int intelligence, int numberOfPlayer) {
        Players choix = null;
        switch (classOfPlayer) {
            case 1:
                choix = new Guerrier(level, force, agility, intelligence, numberOfPlayer);
                break;
            case 2:
                choix= new Rodeur(level, force, agility, intelligence, numberOfPlayer);
                break;
            case 3:
                choix = new Mage(level, force, agility, intelligence, numberOfPlayer);
                break;
        }
        System.out.println(choix);
        return choix;
    }

    // ---- Game turn ----

    /**
     * cette méthode lance le jeux
     */
    private void Start(){
        int turn = 1;

        while (player1.getLife() > 0 && player2.getLife() > 0){

            if(turn % 2 == 1){
                TourATour(player1, player2);
            }else{
                TourATour(player2, player1);
            }
            turn++;
        }
        if (player1.getLife() <= 0){
            System.out.println("Joueur 1 à perdu !");
        }else{
            System.out.println("Joueur 2 à perdu !");
        }
    }

    /**
     * cette méthode permet aux joueurs de jouer l'un après l'autre jusqu'à mort s'en suive
     * @param attack la personne qui attaque
     * @param defend la personne qui se defend
     */
    private void TourATour(Players attack, Players defend){
        System.out.println("Joueur " + attack.getNumberOfPlayer() + " (" + attack.getLife() + " de vitalité) veuillez choisir " +
                "votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
        int choix = sc.nextInt();
        if (choix == 1)
            attack.attaqueBasique(defend);
        else
            attack.attaqueSpeciale(defend);
    }

}
