package com.alan.classes;

public class QuadradoHerdado extends Retangulo {
    private int lado;

    public int getLado() {
        return lado;
    }

    public QuadradoHerdado(int lado) {
        super(lado,lado);
        this.lado = lado;
    }
}
