package br.com.letscode;

public class ContaBancaria implements TarifasBancarias {
    private Cliente cliente;
    private double saldo;
    private int id;
    static int contador;

    public ContaBancaria(){
        this.id = contador++;
    }

    public ContaBancaria(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.id = ++contador;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getId(){
        return this.id;
    }

    public void depositar(double valor){
        this.saldo = this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo = this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            conta.depositar(valor);
        }

    }

    @Override
    public void investir(double valor) {

    }

    @Override
    public double consultarSaldo() {
        return 0;
    }

    public String toString(){
        return "Conta: "+this.cliente.getNome()+" id: "+this.id+" saldo: "+this.saldo;
    }

}
