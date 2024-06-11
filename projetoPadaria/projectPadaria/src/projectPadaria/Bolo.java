package projectPadaria;

public class Bolo  extends Produto{
    private String sabor;
    private String tamanho;
    private String tipoDeCobertura;

    public Bolo() {

    }

    public Bolo(String nome, double preco, Integer quantidadeEstoque, String dataValidade,
                String sabor, String tamanho, String tipoDeCobertura) {
        super(nome, preco, quantidadeEstoque, dataValidade);
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Sabor: " + this.sabor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Tipo de Cobertura: " + this.tipoDeCobertura);
    }

    public void verificarDisponibilidade() {
        if(this.getQuantidadeEstoque() >= 0) {
            System.out.println("Produto disponível!");
        }else {
            System.out.println("Produto indisponível no momento...");
        }
    }

    public double calcularPrecoFinal(double percentual) {
    double valorComDesconto = super.calcularDesconto(percentual);
    return valorComDesconto + 120.0;
    }
}
