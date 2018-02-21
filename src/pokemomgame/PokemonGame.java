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
public class PokemonGame {

    public static void main(String[] args) {
        PokemonFarm pokemonFarm = new PokemonFarm();
        CommandParser commandParser = new CommandParser(pokemonFarm);

        commandParser.run();
    }

}
