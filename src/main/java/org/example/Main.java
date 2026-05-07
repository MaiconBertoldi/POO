package org.example;

public class Main {

    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito(
                "1234",
                "Maicon Bertoldi",
                1500.00,
                "123"
        );
        cartao.dadosCartao();
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento(cartao);
    }
}