package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setWeapon("Катана");
        boss.setHealth(200);
        boss.setDamage(50);
        System.out.println(boss.getWeapon()+ " " + boss.getHealth()+ " " + boss.getDamage());

        }
    }

