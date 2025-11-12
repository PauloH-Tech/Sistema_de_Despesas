package entity;

import java.util.Date;

public class Despesa{

    private double valor;
    private String data;
    private String descricao;
    private boolean status;

    public Despesa(double valor, String data, String descricao, boolean status){
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}

