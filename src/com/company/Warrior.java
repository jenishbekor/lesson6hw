package com.company;

public class Warrior extends Player{
    private String type;

    public Warrior(int health, int hitDamage, String type)
    {
        super(health,hitDamage);
        this.type = type;
        super.setName("Warrior");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
