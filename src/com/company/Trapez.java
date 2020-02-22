package com.company;

public class Trapez extends Figura2D implements CenaZaM2 {

    double cena =20;

    Trapez(double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;

        evaluateField();


    }

    @Override
    void evaluateField() {
        field = (a+b)*h/2;
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
        System.out.println("Cena trapeza za 1m^2: "+wezCene());
    }
}
