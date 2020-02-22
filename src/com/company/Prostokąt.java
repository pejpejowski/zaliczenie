package com.company;

public class Prostokąt extends Figura2D implements CenaZaM2 {

    double cena =16;

    Prostokąt(double a, double b){
        this.a = a;
        this.b = b;

        evaluateField();


    }

    @Override
    void evaluateField() {
        field = a*b;
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
        System.out.println("Cena prostokąta za 1m^2: "+wezCene());
    }
}
