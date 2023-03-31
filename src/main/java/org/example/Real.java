package org.example;

public class Real implements Moeda{
    @Override
    public String getSimbolo() {

        return "R$";
    }

    @Override
    public double getTaxaCambio() {

        return 5.6;
    }
}
