package org.example;

public abstract class PagamentoComMoedaReal extends PagamentoemMoeda{

    public PagamentoComMoedaReal(Moeda moeda) {
        super(moeda);
    }
    public void processarPagamento(double valor) {
        double taxaDeCambio = moeda.getTaxaCambio();
        double valorConvertido = valor * taxaDeCambio;
        String simbolo = moeda.getSimbolo();
        System.out.println("Processando pagamento de " + valor + " " + " (" + valorConvertido + " R$)");
    }
}
