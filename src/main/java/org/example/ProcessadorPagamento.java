package org.example;

public class ProcessadorPagamento {

    CartaoCredito cartaoCredito;

    public ProcessadorPagamento(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;

        public double processar(double valor) {

            if (valor <= 0) {
                System.out.println("valor invalido, valor deve ser maior que zero. ");
                return;
                if (valor > cartaoCredito.getLimiteDisponivel()) {
                    System.out.println("Saldo insuficiente para o pagamento. ");
                    System.out.println("Saldo disponível: " + cartaoCredito.getLimiteDisponivel());


                }
            }
        }}}