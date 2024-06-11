package projectBiblioteca;

public class Aluno {
    private String nome;
    private String endereco;
    private Integer idade;
    private Integer numeroEmprestimoLivro;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, Integer idade, Integer numeroEmprestimoLivro) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.numeroEmprestimoLivro = numeroEmprestimoLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getNumeroEmprestimoLivro() {
        return numeroEmprestimoLivro;
    }

    public void setNumeroEmprestimoLivro(Integer numeroEmprestimoLivro) {
        this.numeroEmprestimoLivro = numeroEmprestimoLivro;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Idade: " + this.idade);
        System.out.println("Numero de livros emprestados: " + this.numeroEmprestimoLivro);
    }

    public void emprestarLivro(Livro livro) {
        if (livro.vefificarDisponibilidade() == true) {
            livro.realizarEmprestimo();
            this.numeroEmprestimoLivro++;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro não disponível para empréstimo...");
        }
    }

    public void devolverLivro(Livro livro) {
        livro.adicionarEstoque(1);
        this.numeroEmprestimoLivro--;
        System.out.println("Livro devolvido!");
    }

}

