package com.alan.classes;

public class Lampada {
    //Atributos
    int qtdEnergia;
    String corLuz;
    int vazaoEnergia;


    //Contrutor
    public Lampada(int qtdEnergia , String corLuz, int vazaoEnergia) {
        this.qtdEnergia = qtdEnergia;
        this.corLuz = corLuz;
        this.vazaoEnergia = vazaoEnergia;
    }

    public Lampada() {
        this.qtdEnergia = 50;
        this.corLuz = "Branca";
        this.vazaoEnergia = 2;
    }

    //metodo com retorno String
    public String mostrarCor () {
        return this.corLuz;
    }

    //metodo sem retorno
    public void piscar () {
        System.out.println("Cor da luz: "+this.mostrarCor()+" Liga-Desliga");
        this.qtdEnergia -= this.vazaoEnergia;
        System.out.println("Qtde de energia sobrando = "+this.qtdEnergia);
    }
}
