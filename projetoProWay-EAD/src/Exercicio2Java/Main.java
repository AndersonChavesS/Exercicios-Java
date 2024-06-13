package Exercicio2Java;

public class Main {
    public static void main(String[] args) {

        Fisica pessoa = new Fisica();
        pessoa.setNome("João da Silva");
        pessoa.setCpf("000.000.000-00");
        pessoa.setEndereco("Rua B, nº0");
        pessoa.setIdade(25);
        pessoa.setStatus(false);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Cpf: " + pessoa.getCpf());
        System.out.println("Endereco: " + pessoa.getEndereco());
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.verFiscal();
        System.out.println("===================================================================");

        Juridica empresa = new Juridica();
        empresa.setNome("Chaves acessoria");
        empresa.setCnpj("00.000.000/0000-00");
        empresa.setEndereco("Rua Bela Vista, 000");
        empresa.setStatus(true);

        System.out.println("Nome: " + empresa.getNome());
        System.out.println("Cnpj: " + empresa.getCnpj());
        System.out.println("Endereco: " + empresa.getEndereco());
        empresa.verFiscal();


    }
}
