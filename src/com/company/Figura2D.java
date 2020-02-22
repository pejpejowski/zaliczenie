package com.company;


abstract public class Figura2D {
    protected double a;
    protected double b;
    protected double h;
    protected double field;

    abstract void evaluateField();

    double getField(){
    return field;
    }

    public abstract double wezCene();

    public abstract void wyswietlCene();
}
