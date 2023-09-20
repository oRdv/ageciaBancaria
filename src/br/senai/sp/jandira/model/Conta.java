package br.senai.sp.jandira.model;

public class Conta {

    private String agencia = "00020-X";

    private int numeroConta = 1254;

    private double saldo = 8645;

    public void realizarSaque(double valorSaque){
        this.saldo -= valorSaque;
        System.out.println("Seu saldo atual é: " + this.saldo);

        if (this.saldo < valorSaque){
            System.out.println("NAO É POSSÍVEL RETIRAR O DINHEIRO! INFORME UM VALOR EXISTENTE");
        }
    }

    public void realizarDeposito(double valorDeposito){

        this.saldo += valorDeposito;
        System.out.println("Seu saldo é: " + this.saldo);


    }

    public void consutarSaldo(){
        System.out.println("O seu saldo é: " + this.saldo);

    }

}
