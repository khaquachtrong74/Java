package com.task.three;

import java.util.Scanner;

public class Battle {
    public final static Scanner SC = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Attack");
        System.out.println("2. Defend");
        System.out.println("0. NextTime");
    }

    public void turnPokemon(Pokemon pokemonA, Pokemon pokemonB) {
        menu();
        System.out.println("Chose your action");
        int action = Integer.parseInt(SC.nextLine());
        switch (action) {
            case 1 -> pokemonA.attack(pokemonB);
            case 2 -> pokemonA.defend();
            case 0 -> {
                System.out.println("Next ");
                pokemonA.setStamina(pokemonA.getStamina()+3);
            }
            default -> System.out.println("Invalid action!, you will have action at next time!");
        }
    }
    private void reward(Pokemon pokemon){
        System.out.println("We have a winner ! " + pokemon);
        pokemon.setReward();
    }
    public void battleFight(Pokemon pokemonA, Pokemon pokemonB) {
        while (pokemonA.getHp() > 0 && pokemonB.getHp() > 0) {
            System.out.println("Turn " + pokemonA.getName());
            turnPokemon(pokemonA, pokemonB);
            System.out.println("Turn " + pokemonB.getName());
            turnPokemon(pokemonB, pokemonA);
        }
        if(pokemonA.getHp() < 0)
        {
            reward(pokemonB);
        }
        else{
            reward(pokemonA);
        }
    }
}
