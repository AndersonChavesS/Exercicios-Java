package projetoProWay;

public class Pessoa {
    private String nome;
    private Integer idade;
    private double altura;
    private double peso;

    public Pessoa() {

    }

    public Pessoa(String nome, Integer idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return this.idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
    }

    public void calcularIMC() {
        double IMC = this.peso / (this.altura * this.altura);
        System.out.println("IMC: " + IMC);
    }

    public void fazerAniversario(){
        this.idade++;
        System.out.println("Parabéns " + this.nome + "! Você completou " + this.idade + "anos.");
    }

    public void cumprimentar(String nomeParaCumprimentar) {
        System.out.println("Olá " + nomeParaCumprimentar + "! Meu nome é " + this.nome);
    }
}
