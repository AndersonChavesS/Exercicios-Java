package projectBiblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private Integer anoDePublicacao;
    private Integer numeroPaginas;
    private Integer quantidadeEstoque;

    public Livro() {

    }

    public Livro(String titulo, String autor, Integer anoDePublicacao, Integer numeroPaginas, Integer quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.numeroPaginas = numeroPaginas;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(Integer anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void imprimirDados() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de publicação: " + this.anoDePublicacao);
        System.out.println("Numero de Paginas: " + this.numeroPaginas);
        System.out.println("Estoque: " + this.quantidadeEstoque);
    }

    public boolean vefificarDisponibilidade() {
        if (this.quantidadeEstoque > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void realizarEmprestimo() {
        if (this.vefificarDisponibilidade() == true) {
            this.quantidadeEstoque--;
            System.out.println("Emprestimo do livro realizado com sucesso!");
        } else {
            System.out.println("Livro indisponível para empréstimo!");
        }
    }

    public void adicionarEstoque(Integer quantidade) {
        this.quantidadeEstoque += quantidade;
    }
}
