package org.example;

public class Dolar implements Moeda{
    @Override
    public String getSimbolo() {
        return "$";
    }

    @Override
    public double getTaxaCambio() {
        return 1.0;
    }
}
