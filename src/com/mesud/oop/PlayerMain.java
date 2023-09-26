package com.mesud.oop;

public class PlayerMain {
    public static void main(String[] args) {
        Player player_one = new Player("Mesud", 70, Weapen.ATTACK_ONE);
        System.out.println(player_one);
        player_one.loseHealth(50);
        System.out.println(player_one);
        player_one.restoreHealth(120);
        System.out.println(player_one);
        player_one.loseHealth(300);
        System.out.println(player_one);

    }
}
