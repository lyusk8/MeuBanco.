package br.com.letscode;

public class ContaPf extends ContaBancaria implements TarifasBancarias {

    private String cpf;

    public ContaPf(){}

    public ContaPf(String cpf) {
        this.cpf = cpf;
    }

    public ContaPf(Cliente cliente, double saldo, String cpf) {
        super(cliente, saldo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void sacar(double valor){
        super.sacar(valor);
    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {
       this.sacar(valor);
       conta.depositar(valor);
    }

    @Override
    public double consultarSaldo() {
        return getSaldo();
    }

    public void abrirContaInvestimento(double valor) {
        Banco banco = new Banco();
        banco.getContas().add(new ContaInvestimentoPj(getCliente(), valor, getCpf()));
    }

    public void abrirPoupança(){

    }


}
