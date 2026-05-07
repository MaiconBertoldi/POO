package org.example;

public class CartaoCredito {
    private String numeroCartao;
    private String titular;
    private double limiteDisponivel;
    private String cvv;

    public CartaoCredito(String numeroCartao, String titular, double limiteDisponivel, String cvv) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.limiteDisponivel = limiteDisponivel;
        this.cvv = cvv;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void dadosCartao() {
        System.out.println("Dados do Cartão");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número: " + getNumeroCartao());
        System.out.println("Limite disponível: R$ " + getLimiteDisponivel());}





}