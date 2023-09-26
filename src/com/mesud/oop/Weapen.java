package com.mesud.oop;

public enum Weapen {
    ATTACK_ONE(10,1.5),
    ATTACK_TWO(20,1),
    ATTACK_THREE(30,0.5);

    private  int damage;
    private  double attackSpeed;

    Weapen(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage(){
        return  damage;
    }
    public double getAttackSpeed(){
        return  attackSpeed;
    }
}
