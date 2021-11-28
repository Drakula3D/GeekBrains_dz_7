package com.geekBrains;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();
        System.out.println();

        Cat[] arrCat = new Cat[5];
        arrCat[0] = new Cat("Simba", 20);
        arrCat[1] = new Cat("Gery", 35);
        arrCat[2] = new Cat("Twinx", 40);
        arrCat[3] = new Cat("Vk", 15);
        arrCat[4] = new Cat("Dayz", 5);

        for (Cat arr : arrCat) {
            arr.eat(plate);
            arr.getSatiety();
            System.out.println();
        }
        plate.info();
        plate.addFood(200);
        plate.info();
    }
}
