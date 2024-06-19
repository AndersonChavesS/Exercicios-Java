public class CarregadorPadrao {
    private String descricao;
    private int bateria;
    private boolean status;

    public CarregadorPadrao() {

    }

    public CarregadorPadrao(String descricao, int bateria, boolean status) {
        this.descricao = descricao;
        this.bateria = bateria;
        this.status = status;
    }

    //Getter and Setter ....

    public void carregar() {
        this.bateria = this.bateria +10;
    }
}
