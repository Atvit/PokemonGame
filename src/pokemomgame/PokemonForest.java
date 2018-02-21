/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemomgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ATTHAVIT
 */
public class PokemonForest {

    private Scanner kb = new Scanner(System.in);
    PokemonBag Bag = new PokemonBag();
    Random rand = new Random();

    public void find() {
        String nameOfType[] = {"Pikaju", "Eevee", "Snorlax"};
        String type = nameOfType[rand.nextInt(3)];
        System.out.println("I'm " + type);
        catchPokemon(type);
    }

    private int selectBall() {
        System.out.println("Please enter your type of pokemon what you want.");
        System.out.println("Type 1 for PokeBall");
        System.out.println("Type 2 for GreatBall");
        System.out.println("Type 3 for UltraBall");
        int ball = kb.nextInt();
        return ball;
    }

    private void catchPokemon(String type) {
        double minRand = 0.0;
        double maxRand = 1.0;
        double result = 0;
        Random rand = new Random();
        double mood = rand.nextDouble() * (maxRand - minRand) + minRand;

        int ball = selectBall();
        switch (ball) {
            case 1:
                result = 0.8 * mood;
                break;
            case 2:
                result = 0.9 * mood;
                break;
            case 3:
                result = mood;
                break;
            default:
                break;
        }
        if (result > 0.5) {
            addPokemon(type);
            System.out.println("Catch success.");
        } else {
            System.out.println("Can't catch any Pokemon, Please try again");
        }
    }

    private void addPokemon(String type) {
        System.out.print("Please insert name of your Pokemon : ");
        String name = kb.next();
        System.out.print("Please insert weight of your Pokemon : ");
        float weight = kb.nextFloat();
        System.out.print("Please insert Step Length of your Pokemon : ");
        float stepLength = kb.nextFloat();

        if (type.equals("Eevee")) {
            Eevee eevee = new Eevee(name, weight, stepLength);
            Bag.AddToBag(eevee);
        } else if (type.equals("Pikaju")) {
            Pikaju pikaju = new Pikaju(name, weight, stepLength);
            Bag.AddToBag(pikaju);
        } else if (type.equals("Snorlax")) {
            Snorlax snorlax = new Snorlax(name, weight, stepLength);
            Bag.AddToBag(snorlax);
        }
    }
}
