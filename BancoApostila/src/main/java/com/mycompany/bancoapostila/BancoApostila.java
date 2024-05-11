package com.mycompany.bancoapostila;

public class BancoApostila {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ConnectionFactory factory = new ConnectionFactory();
        factory.obtemConexao();
    }
}
