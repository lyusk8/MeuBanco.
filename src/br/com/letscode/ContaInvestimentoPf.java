package br.com.letscode;

public class ContaInvestimentoPf extends ContaPf {

    private int id;

    public ContaInvestimentoPf(){}

    public ContaInvestimentoPf(Cliente cliente, double saldo, String cpf) {
        super(cliente, saldo, cpf);
        this.id = super.getId();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }

    public void investir(double valor){
        this.depositar(valor);
    }

    public void transferir(double valor, ContaBancaria conta){
        if(super.getSaldo() >= valor){
            super.sacar(valor);
            conta.depositar(valor);
        }
    }
}
