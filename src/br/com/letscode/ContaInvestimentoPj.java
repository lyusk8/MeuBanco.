package br.com.letscode;

public class ContaInvestimentoPj extends ContaPj {

    private int id;

    public ContaInvestimentoPj(){}

    public ContaInvestimentoPj(Cliente cliente, double saldo, String cnpj) {
        super(cliente, saldo, cnpj);
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
        this.depositar(getSaldo()*0.02);
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
