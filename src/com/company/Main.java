package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setSuperBlock("Defended");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getSuperBlock());
        createHeroes();
        for (Hero hero:createHeroes()){
            System.out.println(" ЗДОРОВЬЕ " + hero.getHealth() + " УРОН " + hero.getDamage() + " УМЕНИЕ " + hero.getSuperabilyty() );
        }
    }


    public static Hero[] createHeroes() {
        Hero spartac = new Hero(100, 30, "abilyty");
        Hero defender = new Hero(150, 25, "desrease");
        Hero archer = new Hero(80, 40, "fireArrow");
        Hero[] heroes = {spartac, defender, archer};
        return heroes;

        }



        }



