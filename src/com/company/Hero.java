package com.company;

public class Hero extends Player {
    private String type;

    public Hero(int health, int hitDamage, String type) {
        super(health, hitDamage);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
