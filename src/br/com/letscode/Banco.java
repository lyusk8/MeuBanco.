package br.com.letscode;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    Scanner sc = new Scanner(System.in);

    private static ArrayList <ContaBancaria> contas;

    public Banco(){
        contas = new ArrayList<ContaBancaria>();
    }

    public ArrayList<ContaBancaria> getContas(){
        return contas;
    }

    public void abrirConta(){
        System.out.println("Escolha o tipo de conta: \n 1 - Conta pessoa física \n 2 - Conta pessoa Jurídica");
        String escolha = sc.next();
        if(escolha.equals("1")){
            abrirContaPf();
        } else if(escolha.equals("2")){
            abrirContaPj();
        } else{
            System.out.println("escolha opção 1 ou opção 2");
        }
    }

    protected void abrirContaPf(){
        System.out.println("Digite nome do cliente");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Digite telefone do cliente");
        String telefone = sc.next();
        System.out.println("Digite valor do depósito inicial");
        double saldo = sc.nextDouble();
        System.out.println("Digite cpf do cliente");
        String cpf = sc.next();

        contas.add(new ContaPf(new Cliente(nome, telefone), saldo, cpf));
    }

    public void abrirContaPj(){
        System.out.println("Digite a razão social do cliente");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Digite telefone do cliente");
        String telefone = sc.next();
        System.out.println("Digite valor do depósito inicial");
        double saldo = sc.nextDouble();
        System.out.println("Digite cnpj do cliente");
        String cnpj = sc.next();

        contas.add(new ContaPj(new Cliente(nome, telefone), saldo, cnpj));

    }

    protected void abrirConta(ContaBancaria conta){
        contas.add(conta);
    }

    protected ContaBancaria buscarConta(int id){
        ContaBancaria conta = null;
        for(ContaBancaria c : this.contas){
            if(c.getId() == id){
                System.out.println(c);
                conta = c;
            }
        }
        return conta;
    }

    public void sacar(int id, double valor){
        for(ContaBancaria conta : contas){
            if(conta.getId() == id){
                conta.sacar(valor);
            }
        }
    }


    public void listar(){
        for (ContaBancaria conta : this.contas){
            System.out.println(conta);
        }
    }

}
