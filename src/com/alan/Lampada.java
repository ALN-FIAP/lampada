package com.alan;

public class Lampada {
    int qtdEnergia;

    public void piscar () {
        System.out.println("Liga-Desliga");
        this.qtdEnergia --;
        System.out.println("Qtde de energia sobrando = "+this.qtdEnergia);
    }
}
