package com.company;

public class Warrior extends Hero{

    public Warrior(int health, int hitDamage, String type)
    {
        super(health,hitDamage,type);
        super.setName("Warrior");
    }

}
