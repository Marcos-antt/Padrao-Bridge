package org.example;

public abstract class PagamentoComMoedaDolar extends PagamentoemMoeda{

    public PagamentoComMoedaDolar(Moeda moeda) {
        super(moeda);
    }
    public void processarPagamento(double valor) {
        double taxaDeCambio = moeda.getTaxaCambio();
        double valorConvertido = valor * taxaDeCambio;
        String simbolo = moeda.getSimbolo();
        System.out.println("Processando pagamento de " + valor + " "  + " (" + valorConvertido + " USD");
    }
}
