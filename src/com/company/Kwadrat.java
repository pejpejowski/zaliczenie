package com.company;

public class Kwadrat extends Figura2D implements CenaZaM2{

    double cena =12;

    Kwadrat(double a){
    this.a = a;

    evaluateField();


    }

    @Override
    void evaluateField() {
    field = a*a;
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
    System.out.println("Cena kwadrata za 1m^2: "+wezCene());
    }
}
