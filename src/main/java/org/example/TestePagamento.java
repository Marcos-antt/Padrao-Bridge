package org.example;

public class TestePagamento {

    public static void main(String[] args){
        Moeda dolar = new Dolar();
        PagamentoemMoeda pagamentoDolar = new PagamentoComMoedaDolar(dolar) {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        pagamentoDolar.processarPagamento(1.00);

        Moeda real = new Real();
        PagamentoemMoeda pagamentoReal = new PagamentoComMoedaReal(real) {
            @Override
            public void processarPagamento(double valor) {
                super.processarPagamento(valor);
            }
        };
        pagamentoReal.processarPagamento(1.00);
    }
}
