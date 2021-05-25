package br.com.letscode;

public interface TarifasBancarias {

    public void sacar(double valor);
    public void transferir(double valor, ContaBancaria conta);
    public void investir(double valor);
    public double consultarSaldo();
}
