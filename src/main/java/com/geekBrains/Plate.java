package com.geekBrains;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Тарелка: " + food);
    }

    public void addFood(int food) {
        this.food = food;
        System.out.println("В тарелку добавили " + food + " еды");
    }

    public boolean decreaseFood(int n) {
        if ((food - n) >= 0) {
            food -= n;
            System.out.println("Коту удалось покушать");
            return true;
        } else System.out.println("Кот не покушал, в тарелке недостаточно еды");
        return false;
    }
}
