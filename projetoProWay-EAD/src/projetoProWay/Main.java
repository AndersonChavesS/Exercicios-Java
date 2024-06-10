package projetoProWay;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 30, 1.75, 70.0);
        Pessoa pessoa2 = new Pessoa("Maria", 25, 1.65, 60.0);

        pessoa1.imprimirDados();
        pessoa1.calcularIMC();
        pessoa1.fazerAniversario();
        System.out.println("----------------------");
        pessoa1.imprimirDados();
        pessoa1.cumprimentar(pessoa2.getNome());
        System.out.println("***************************");
        pessoa2.imprimirDados();
        pessoa2.calcularIMC();
        pessoa2.fazerAniversario();
        System.out.println("------------------------");
        pessoa2.imprimirDados();
        pessoa2.cumprimentar(pessoa1.getNome());
    }


}