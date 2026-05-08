package org.example;

public class ProcessadorPagamento {

    CartaoCredito cartaoCredito;

    public ProcessadorPagamento(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;

        public boolean processar(double valor) {
            if (valor <= 0) {
                System.out.println("Valor inválido, valor deve ser maior que zero.");
                return false;
            }
            if (valor > cartaoCredito.getLimiteDisponivel()) {
                System.out.println("Saldo insuficiente para o pagamento.");
                System.out.println("Saldo disponível: " + cartaoCredito.getLimiteDisponivel());
                return false;
            }


        }
    }}}