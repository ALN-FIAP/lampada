package com.alan.classes;

public class Quadrado  {
    // Atributos
    private int lado;

    // Construtor
    public Quadrado (int lado) {
        if (lado > 0)
            this.lado = lado;
        else
            this.lado = 0;
    }

    public Quadrado () {
        this(0);
    }

    public void setLado(int lado) {
        if( lado > 0)
            this.lado = lado;
    }

    public int getLado() {
        return this.lado;
    }
    public int getArea() {

        return (this.getLado() * this.getLado());
    }
}
