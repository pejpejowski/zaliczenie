package com.company;

public class Romb extends Figura2D implements CenaZaM2 {

    double cena =7;

    Romb(double a, double h){
        this.a = a;
        this.h = h;

        evaluateField();


    }

    @Override
    void evaluateField() {
        field = a*h;
    }
    @Override
    public void CenaZa1M2(double cena) {
        this.cena = cena;
    }


    @Override
    public double wezCene() {
        return cena * field;
    }

    @Override
    public void wyswietlCene() {
        System.out.println("Cena romba za 1m^2: "+wezCene());
    }
}