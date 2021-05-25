package br.com.letscode;

public class Cliente {
    private String nome;
    private String telefone;

    public Cliente (){}

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome: " + nome + ", telefone: " + telefone + "}";
    }
}
