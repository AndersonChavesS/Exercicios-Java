package projectBiblioteca;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro("livro1", "autor do livro1", 1992, 331, 3);
        Livro livro2 = new Livro("livro2", "autor do livro2", 2000, 151, 1);
        Livro livro3 = new Livro("livro3", "autor do livro3", 2010, 420, 2);


        Aluno aluno1 = new Aluno("Paulo", "Rua da Vitoria", 20, 0);
        Aluno aluno2 = new Aluno("Clarisse", "Rua Dom Bosco", 18, 2);
        Aluno aluno3 = new Aluno("João", "Rua Tiradentes", 22, 1);

        aluno1.imprimirDados();
        livro1.imprimirDados();
        aluno1.emprestarLivro(livro1);
        aluno1.imprimirDados();
    }
}