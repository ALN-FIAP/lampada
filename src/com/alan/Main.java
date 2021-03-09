package com.alan;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Lampada l = new Lampada();

        l.qtdEnergia = 10;
        l.vazaoEnergia = 5;
        l.corLuz = "Vermelho";

        l.piscar();
    }
}
