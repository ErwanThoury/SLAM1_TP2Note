/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetdex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class ProjetDex {
    private static ArrayList<Version> versions = new ArrayList<Version>();
    private static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Version EmeraudeRouge = new Version("Emeraude Rouge");
        Version RubisRugby = new Version("Rubis Rugby");
        Version SaphirSonic = new Version("Saphir Sonic");
        Version PlatineBleu = new Version("Platine Bleu");
        Version GigaChen = new Version("Giga Chen");
        
                    
        // Ajout des starters pour Emeraude Rouge
        Pokemon salameche = new Pokemon("Salamèche", 4, "Feu");
        Pokemon machoc = new Pokemon("Machoc", 66, "Combat");
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electrique");
        salameche.ajouterPokemonSuperieur("Reptincel");
        salameche.ajouterPokemonSuperieur("Dracaufeu");
        machoc.ajouterPokemonSuperieur("Machopeur");
        machoc.ajouterPokemonSuperieur("Mackogneur");
        pikachu.ajouterPokemonSuperieur("Raichu");
        EmeraudeRouge.addPokemon(salameche);
        EmeraudeRouge.addPokemon(machoc);
        EmeraudeRouge.addPokemon(pikachu);

        // Ajout des starters pour Rubis Rugby
        Pokemon carapuce = new Pokemon("Carapuce", 7, "Eau");
        Pokemon gobou = new Pokemon("Gobou", 258, "Eau");
        Pokemon abo = new Pokemon("Abo", 23, "Poison");
        carapuce.ajouterPokemonSuperieur("Carabaffe");
        carapuce.ajouterPokemonSuperieur("Tortank");
        gobou.ajouterPokemonSuperieur("Flobio");
        gobou.ajouterPokemonSuperieur("Laggron");
        abo.ajouterPokemonSuperieur("Arbok");
        RubisRugby.addPokemon(carapuce);
        RubisRugby.addPokemon(gobou);
        RubisRugby.addPokemon(abo);

        // Ajout des starters pour Saphir Sonic
        Pokemon stalgamin = new Pokemon("Stalgamin", 361, "Glace");
        Pokemon tarsal = new Pokemon("Tarsal", 280, "Psy");
        Pokemon goupix = new Pokemon("Goupix", 37, "Feu");
        stalgamin.ajouterPokemonSuperieur("Oniglali");
        tarsal.ajouterPokemonSuperieur("Kirlia");
        tarsal.ajouterPokemonSuperieur("Gardevoir");
        goupix.ajouterPokemonSuperieur("Feunard");
        SaphirSonic.addPokemon(stalgamin);
        SaphirSonic.addPokemon(tarsal);
        SaphirSonic.addPokemon(goupix);

        // Ajout des starters pour Platine Bleu
        Pokemon ptitard = new Pokemon("Ptitard", 60, "Eau");
        Pokemon stari = new Pokemon("Stari", 120, "Eau");
        Pokemon bulbizarre = new Pokemon("Bulbizarre", 1, "Plante", "Poison");
        ptitard.ajouterPokemonSuperieur("Tetarte");
        ptitard.ajouterPokemonSuperieur("Tartard");
        stari.ajouterPokemonSuperieur("Staross");
        bulbizarre.ajouterPokemonSuperieur("Herbizarre");
        bulbizarre.ajouterPokemonSuperieur("Empiflor");
        PlatineBleu.addPokemon(ptitard);
        PlatineBleu.addPokemon(stari);
        PlatineBleu.addPokemon(bulbizarre);

        // Ajout des starters pour Giga Chen
        Pokemon racaillou = new Pokemon("Racaillou", 74, "Roche");
        Pokemon fantominus = new Pokemon("Fantominus", 92, "Spectre", "Poison");
        Pokemon abra = new Pokemon("Abra", 63, "Psy");
        racaillou.ajouterPokemonSuperieur("Gravalanch");
        racaillou.ajouterPokemonSuperieur("Grolem");
        fantominus.ajouterPokemonSuperieur("Spectrum");
        fantominus.ajouterPokemonSuperieur("Ectoplasma");
        abra.ajouterPokemonSuperieur("Kadabra");
        abra.ajouterPokemonSuperieur("Alakazam");
        GigaChen.addPokemon(racaillou);
        GigaChen.addPokemon(fantominus);
        GigaChen.addPokemon(abra);

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Créer un Pokemon et l'ajouter au starter d'une version");
            System.out.println("2. Afficher le nom des Pokémons starter d'une version");
            System.out.println("3. Afficher tous les Pokémons d'un type");
            System.out.println("4. Afficher le nombre total de Pokémons");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine(); // consomme le retour chariot

            switch (choix) {
                case 1:
                    // ajouterPokemon(); 
                    break;
                case 2:
                    // afficherStarters();
                    break;
                case 3:
                    // afficherParType();
                    break;
                case 4:
                    // afficherNbPokemon();
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix invalide !");
            }
            System.out.println(); // saut de ligne
        }

    }
}
