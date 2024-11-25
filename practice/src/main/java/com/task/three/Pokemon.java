package com.task.three;

public class Pokemon {
    private String name;
    private int level;
    private String type;
    private int hp;
    private int damage;
    private int stamina;
    private int constHp;
    private int constDamage;
    private int constStamina;
    private boolean block = false;
    public Pokemon(String name, int level, String type, int hp, int damage, int stamina) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.hp = hp;
        this.damage = damage;
        this.stamina = stamina;
        this.constHp = hp;
        this.constDamage = damage;
        this.constStamina = stamina;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(name);
        stringBuilder.append("\nLevel: ").append(level);
        stringBuilder.append("\nType: ").append(type);
        stringBuilder.append("\nHP: ").append(hp);
        stringBuilder.append("\nStamina: ").append(stamina);
        // TODO Auto-generated method stub
        return stringBuilder.toString();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int attack(){return this.damage;}
    public void attack(Pokemon other){
        if(block && this.stamina > 10){
            this.stamina -= 10;
            other.setHp((other.getHp()+other.getHp()*10/100) - this.damage);
            block=false;
        }
        if(this.stamina < 10) { 
            System.out.println("Not enought stamina, next turn!");
            this.stamina += 3;
            return;
        }   
        other.setHp(other.getHp()-this.damage);
    }
    public void defend(){block=true;}

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getConstHp() {
        return constHp;
    }

    public int getConstDamage() {
        return constDamage;
    }

    public int getConstStamina() {
        return constStamina;
    }
    public void setReward(){
        this.level++;
        this.hp += (int)(this.constHp*7/100);
        this.damage +=(int)(this.constDamage*4/100);
        this.stamina += (int)(this.constStamina*3/100);

        this.constHp = this.hp;
        this.constDamage = this.damage;
        this.constStamina = this.stamina;
    }
}
