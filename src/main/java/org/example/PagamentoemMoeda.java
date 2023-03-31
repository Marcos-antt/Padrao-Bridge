package org.example;

public abstract class PagamentoemMoeda implements Pagamento{
    protected Moeda moeda;

    public PagamentoemMoeda(Moeda moeda){
        this.moeda = moeda;
    }
    public abstract void processarPagamento(double valor);
}
