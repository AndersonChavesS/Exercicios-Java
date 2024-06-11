package projectPadaria;

public class Produto {
    private String nome;
    private double preco;
    private Integer quantidadeEstoque;
    private String dataValidade;

    public Produto() {

    }

   public Produto(String nome, double preco, Integer quantidadeEstoque, String dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.dataValidade = dataValidade;
   }
   public String getNome() {
        return nome;
   }
   public void setNome(String nome) {
        this.nome = nome;
   }
   public double getPreco() {
        return preco;
   }
   public void setPreco(double preco) {
        this.preco = preco;
   }
   public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
   }
   public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
   }
   public String getDataValidade() {
        return dataValidade;
   }
   public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
   }

   public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Quantidade: " + this.quantidadeEstoque);
        System.out.println("Data de Validade: " + this.dataValidade);
   }

   public boolean verificarDisponibilidade(int quantidade) {
        if (this.quantidadeEstoque >= quantidade) {
            return true;
        }else {
            return false;
        }
   }

   public double calcularDesconto(double percentual) {
        double desconto = this.preco * percentual;
        return this.preco - desconto;
   }
}
