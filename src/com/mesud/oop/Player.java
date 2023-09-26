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
        int newHealthValue = healthPercentage - damage;
        if(newHealthValue<=0){
            System.out.println(name + " player has been knocked out of game");
        }
        checkHealthPercentage(newHealthValue);
    }
    public void  restoreHealth(int healthPotion){
        checkHealthPercentage( healthPercentage + healthPotion);
    }
    @Override
    public String toString() {
        return "Name : " + name + " Healt_Peecentage : " + healthPercentage + " Weapen : " +
                weapen.getDamage() +" - "  + weapen.getAttackSpeed() +
                " Weapen_Deal : " + (weapen.getDamage()*weapen.getAttackSpeed());
    }
}
