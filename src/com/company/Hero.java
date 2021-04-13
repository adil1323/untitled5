package com.company;

public class Hero {
private int health;
private int damage;
private String superabilyty;

    public Hero(int health, int damage, String superabilyty) {
        this.health = health;
        this.damage = damage;
        this.superabilyty = superabilyty;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperabilyty() {
        return superabilyty;
    }
}
