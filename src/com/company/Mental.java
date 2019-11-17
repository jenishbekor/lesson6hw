package com.company;

public class Mental extends Player {
    private String type;

    public Mental(int health, int hitDamage, String type)
    {
        super(health,hitDamage);
        this.type = type;
        super.setName("Mental");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
