package Exercicio2Java;

import javax.swing.*;

public class Juridica extends Pessoa {
    private String cnpj;

    public Juridica() {

    }

    public Juridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
