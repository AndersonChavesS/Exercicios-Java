package projectPadaria;

import java.sql.SQLOutput;

public class Pao extends Produto{
    private String tipoFarinha;
    private double peso;
    private String tipoPao;

    public Pao() {

    }

    public Pao(String nome, double preco, Integer quantidadeEstoque, String dataValidade,
               double peso, String tipoFarinha, String tipoPao) {
        super(nome, preco, quantidadeEstoque, dataValidade);
        this.peso = peso;
        this.tipoFarinha = tipoFarinha;
        this.tipoPao = tipoPao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoFarinha() {
        return tipoFarinha;
    }

    public void setTipoFarinha(String tipoFarinha) {
        this.tipoFarinha = tipoFarinha;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Tipo de Farinha: " + this.tipoFarinha);
        System.out.println("Peso: " + this.peso);
        System.out.println("Tipo de Pao: " + this.tipoPao);
    }

    public double calcularPrecoFinal(double percentual) {
        double valorComDesconto = super.calcularDesconto(percentual);
        return valorComDesconto + 10.0;
    }

}
