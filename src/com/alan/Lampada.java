package com.alan;

public class Lampada {
    int qtdEnergia;
    String corLuz;
    int vazaoEnergia;



    public String mostrarCor () {
        return this.corLuz;
    }

    public void piscar () {

        System.out.println("Cor da luz: "+this.mostrarCor()+" Liga-Desliga");
        this.qtdEnergia -= this.vazaoEnergia;
        System.out.println("Qtde de energia sobrando = "+this.qtdEnergia);
    }
}
