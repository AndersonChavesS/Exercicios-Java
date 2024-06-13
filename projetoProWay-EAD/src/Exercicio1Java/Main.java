package Exercicio1Java;
//Instanciando objeto

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Paulo");
        funcionario.setCpf("000.000.000-00");
        funcionario.setSalario(2500.00);

        System.out.println("-- Funcionário --");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cpf: " + funcionario.getCpf());
        funcionario.mostrarSalario();
    }
}
