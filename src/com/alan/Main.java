package com.alan;

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
    }
}
