package br.com.letscode;

public class ContaPoupanca extends ContaPf{

    public ContaPoupanca(){}

    public ContaPoupanca(Cliente cliente, double saldo, int id, String cpf) {
        super(cliente, saldo, cpf);
    }

    @Override
    public Cliente getCliente() {
        return super.getCliente();
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {
        super.transferir(valor, conta);
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }
}
