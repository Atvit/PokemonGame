/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemomgame;

import java.io.*;
import java.util.*;

/**
 *
 * @author ATTHAVIT
 */
public class CommandParser {

    private PokemonFarm pokemonFarm;
    private Scanner commandScanner;
    private boolean isRunning;

    public CommandParser(PokemonFarm pokemonFarm) {
        this.pokemonFarm = pokemonFarm;
        commandScanner = new Scanner(System.in);
        isRunning = false;
    }

    public void run() {
        isRunning = true;
        String command;

        System.out.println("Hello Pokemon Game");
        while (isRunning) {
            System.out.print("\nWhat do you want? Type: ");
            command = commandScanner.next();
            // System.out.println("You type \'"+command+"\'");
            if (command.equals("quit")) {
                isRunning = false;
                System.out.println("Good bye, See you next time.");
            } else if (command.equals("add")) {
                this.addPokemon();
            } else if (command.equals("list")) {
                this.listPokemons();
            } else if (command.equals("feed")) {
                this.feedPokemons();
            } else if (command.equals("exercise")) {
                this.exercisePokemons();
            } else if (command.equals("catch")) {
                this.catchPokemons();
            }

        }

    }

    private void addPokemon() {
        //commandScanner.nextLine();
        // input name weight length
        System.out.print("Please insert type of your Pokemon (Eevee, Pikaju, Snorlax): ");
        String pokemonType = commandScanner.next();
        System.out.print("Please insert name of your Pokemon : ");
        String name = commandScanner.next();
        System.out.print("Please insert weight of your Pokemon : ");
        float weight = commandScanner.nextFloat();
        System.out.print("Please insert Step Length of your Pokemon : ");
        float stepLength = commandScanner.nextFloat();

        if (pokemonType.equals("Eevee")) {
            Eevee eevee = new Eevee(name, weight, stepLength);
            pokemonFarm.addPokemon(eevee);
        } else if (pokemonType.equals("Pikaju")) {
            Pikaju pikaju = new Pikaju(name, weight, stepLength);
            pokemonFarm.addPokemon(pikaju);
        } else if (pokemonType.equals("Snorlax")) {
            Snorlax snorlax = new Snorlax(name, weight, stepLength);
            pokemonFarm.addPokemon(snorlax);
        }

    }

    private void listPokemons() {
        System.out.println("==========================================");
        System.out.println("Pokemon List");
        System.out.println("==========================================");
        this.pokemonFarm.list();
        System.out.println("==========================================");
    }

    private void feedPokemons() {
        System.out.print("Which pokemon do you want to feed? ");
        String name = this.commandScanner.next();
        if (name.equals("all")) {
            this.pokemonFarm.feed("all");
        } else {
            this.pokemonFarm.feed(name);
        }
    }

    private void exercisePokemons() {
        System.out.print("Which pokemon do you want to exercise? ");
        String name = this.commandScanner.next();
        if (name.equals("all")) {
            this.pokemonFarm.exercise("all");
        } else {
            this.pokemonFarm.exercise(name);
        }
    }

    private void catchPokemons() {
        PokemonForest catchPokemon = new PokemonForest();

        int i = 1;
        while (i == 1) {
            System.out.print("Please type your command. (find or quit)");
            String catchCommand = commandScanner.next();
            if (catchCommand.equals("find")) {
                catchPokemon.find();
            } else if (catchCommand.equals("quit")) {
                i = 0;
            }
        }
    }

}
