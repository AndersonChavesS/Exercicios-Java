package projectPadaria;

public class Main {
    public static void main(String[] args) {

       Pao pao = new Pao("Pão árabe", 20.0, 15, "23/05/2023", 0.3,
               "Integral", "Arabe");

       pao.imprimirDados();
       double valorFinalPao = pao.calcularPrecoFinal(0.5);
       System.out.println("Valor final da pao: " + valorFinalPao);

        System.out.println("--------------------------------------");

        Bolo bolo = new Bolo("Bolo de cenoura", 50.0, 10, "20/05/2023",
                "Cenoura", "Médio", "Chocolate");

        bolo.imprimirDados();
        double valorFinalBolo = bolo.calcularPrecoFinal(0.1);
        System.out.println("Valor final da bolo: " + valorFinalBolo);
    }
}