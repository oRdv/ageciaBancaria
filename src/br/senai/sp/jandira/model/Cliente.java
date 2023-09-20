package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

    public String nome, endereco;

    public long cpf, rg, telefone;

    Scanner scanner = new Scanner(System.in);

    public void cadrastrarCliente(){


        System.out.println("----------- Cadastro Cliente -------------");
        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe o seu enderço: ");
        endereco = scanner.nextLine();
        System.out.println("Informe o seu CPF: ");
        cpf = scanner.nextLong();
        System.out.println("Informe o seu RG: ");
        rg = scanner.nextLong();
        System.out.println("Informe o seu telefone: ");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("---------- Cadrastro Finalizado ----------");
    }
}
