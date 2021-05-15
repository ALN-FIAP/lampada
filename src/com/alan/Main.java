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

        TesteException t = new TesteException();

        try{
            t.lancaCheckedException(0);

        } catch (Exception e) {

            System.out.println("Foi lançada uma checked exception "+e.getMessage());
        }

        try {
            t.lancaUnchekedException(1);
            t.lancaMinhaException(0);
        } catch (MinhaException e) {
            System.out.println("Foi lançada Minha exception "+e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Foi lançada Runtime exception "+e.getMessage());
        }



        System.out.println("FIM DO PROGRAMA TCHAU!");

    }
}
