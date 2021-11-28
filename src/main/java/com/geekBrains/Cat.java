package com.geekBrains;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            setSatiety(true);
        }
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void getSatiety() {
        if (satiety) {
            System.out.println(getName() + " Сыт!!!");
        } else System.out.println(getName() + " Голоден!");
    }
}
