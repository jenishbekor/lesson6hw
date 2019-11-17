package com.company;

public class Magical extends Player {
    private String type;

    public Magical(int health, int hitDamage, String type)
    {
        super(health,hitDamage);
        this.type = type;
        super.setName("Magical");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
