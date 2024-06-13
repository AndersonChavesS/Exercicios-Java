package Exercicio1Java;
//implementação da classe

public class Funcionario {
    private String nome;
    private String cpf;
    private Double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void mostrarSalario() {
        System.out.println("Salário: R$" + this.salario);
    }
}
