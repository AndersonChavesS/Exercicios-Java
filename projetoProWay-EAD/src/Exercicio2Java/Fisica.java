package Exercicio2Java;

public class Fisica extends Pessoa {
    private String cpf;
    private int idade;

    public Fisica() {

    }

    public Fisica(String cpf, int idade) {
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
