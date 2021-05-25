package br.com.letscode;

public class Aplicacao {

    public static void main(String[] args) {

        Banco banco = new Banco();

        ContaBancaria c1 = new ContaPf(new Cliente("Fatima"), 10000, "123456789");
        ContaPj c2 = new ContaPj(new Cliente("Roberto"), 10000, "12345678900");
        banco.abrirConta(c1);
        banco.abrirConta(c2);
        //banco.abrirConta();
        //banco.abrirConta();

        banco.sacar(1, 2000);
        banco.sacar(2, 2000);
        banco.listar();
        c2.abrirContaInvestimentoPj(3000);
        banco.buscarConta(3);
    }
}
