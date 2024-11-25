package com.task.three;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int age;
    private List<Pokemon> pokemons = new ArrayList<>();

    public Trainer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

}
