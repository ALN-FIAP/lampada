package com.alan;

import com.alan.classes.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //um objeto
        Lampada l = new Lampada(10,"Azul",3);
        //outro objeto
        Lampada l2 = new Lampada();
        l.piscar();
        l2.piscar();

        l = l2;
        
        l.piscar();
        
        Quadrado q = new Quadrado(8);
        q.setLado(-3);
        System.out.println("Area do quadrado de lado " + q.getLado() +" é: "+ q.getArea());

        FormaGeometrica qHerdado = new QuadradoHerdado(3);


        System.out.println("Area do quadrado herdado eh: " + qHerdado.getArea());

    }
}
