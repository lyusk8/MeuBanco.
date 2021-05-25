package br.com.letscode;

public class ContaPj extends ContaBancaria implements TarifasBancarias {

    private String cnpj;

    public ContaPj(){}

    public ContaPj(Cliente cliente, double saldo, String cnpj) {
        super(cliente, saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        if(super.getSaldo() >= valor){
            super.sacar(valor);
            super.sacar(valor *= .05);
        }
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {
        if(valor <= super.getSaldo()){
            this.sacar(valor);
            conta.depositar(valor);
        }
    }

    public void abrirContaInvestimentoPj(double valor) {
        Banco banco = new Banco();
        banco.getContas().add(new ContaInvestimentoPj(getCliente(), valor, getCnpj()));
    }

    @Override
    public double consultarSaldo() {
        return super.getSaldo();
    }

}
