/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemomgame;

import java.util.*;

/**
 *
 * @author ATTHAVIT
 */
public class PokemonFarm {

    private ArrayList<Pokemon> pokemons;

    public PokemonFarm() {
        pokemons = new ArrayList<Pokemon>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void list() {
        for (Pokemon pokemon : pokemons) {
            pokemon.print();
        }
    }

    public void feed(String pokemonName) {
        if (pokemonName.equals("all")) {
            for (Pokemon pokemon : pokemons) {
                pokemon.eat();
            }
        } else {
            for (Pokemon pokemon : pokemons) {
                if (pokemon.getName().equals(pokemonName)) {
                    pokemon.eat();
                    break;
                }
            }
        }
    }

    public void exercise(String pokemonName) {
        if (pokemonName.equals("all")) {
            for (Pokemon pokemon : pokemons) {
                pokemon.exercise();
            }
        } else {
            for (Pokemon pokemon : pokemons) {
                if (pokemon.getName().equals(pokemonName)) {
                    pokemon.exercise();
                    break;
                }
            }
        }
    }
}
