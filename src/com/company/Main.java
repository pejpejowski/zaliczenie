package com.company;


import java.util.ArrayList;

public class Main {

Integer max = 12;

    public static void main(String[] args) {
        ArrayList<Figura2D> figury = new ArrayList<>();
        figury.add(new Kwadrat(4));
        figury.add(new Prostokąt(3,6));
        figury.add(new Trapez (3, 6,12));
        figury.add(new Romb(2,13));
        figury.add(new Romb(4,13));
        figury.add(new Kwadrat(12));
        figury.add(new Kwadrat(13));
        figury.add(new Kwadrat(13));
        figury.add(new Kwadrat(40));
        figury.add(new Kwadrat(11));

        figury.add(new Trapez(11,3,18));

        for (int i = 0; i < 11; i++) {
            figury.get(i).wyswietlCene();
            figury.get(i).evaluateField();

        }


    }
}
