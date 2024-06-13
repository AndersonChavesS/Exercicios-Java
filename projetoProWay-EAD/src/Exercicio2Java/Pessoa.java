package Exercicio2Java;

public class Pessoa {
    private String nome;
    private String endereco;
    private boolean status;

    public Pessoa() {

    }

    public Pessoa(String nome, String endereco, boolean status) {
        this.nome = nome;
        this.endereco = endereco;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void verFiscal() {
        if (status == true) {
            System.out.println(this.nome + ", seu cadastro está Regular.");
        } else {
            System.out.println(this.nome + ", seu cadastro está irregular," +
                    " por favor procure\na Receita Federal para regularizar sua situação!");
        }
    }
}
