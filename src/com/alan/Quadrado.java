package com.alan;

public class Quadrado {
    // Atributos
    int lado;

    // Construtor
    public Quadrado (int lado) {
        this.lado = lado;
    }

    public int area() {

        return (this.lado * this.lado);
    }
}
