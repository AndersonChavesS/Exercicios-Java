package projectBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> catagolo;

    public Biblioteca() {

    }

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.catagolo = new ArrayList<>();
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

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
    }

    public void adicionarLivro(Livro livro) {
        this.catagolo.add(livro);
        System.out.println("Livro adicionado ao catálogo!");
    }

    public void imprimirCatalogo() {
        System.out.println("**** Catálogo de Livros ****");
        for (Livro livro : this.catagolo) {
            System.out.println(livro.getTitulo());
        }
    }

}
