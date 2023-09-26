package com.mesud.oop;

public class Player {
    private  String name;
    private  int healthPercentage;
    private  Weapen weapen;

    private void checkHealthPercentage(int healthValue){
        if(healthValue>100){
            this.healthPercentage = 100;
        }
        else if(healthValue<0){
            System.out.println(name + " player has been knocked out of game");
            this.healthPercentage = 0;
        }
        else this.healthPercentage = healthValue;
    }
    public Player(String name , int healthPercentage, Weapen weapen){
        this.name = name;
        checkHealthPercentage(healthPercentage);
        this.weapen = weapen;
    }
    public int healthRemaining(){
        return  healthPercentage;
    }
    public void loseHealth(int damage){
        healthPercentage -= damage;
        checkHealthPercentage(healthPercentage);
    }
    public void  restoreHealth(int healthPotion){
        healthPercentage+= healthPotion;
        if(healthPercentage>100){
            healthPercentage = 100;
        }
    }
}
