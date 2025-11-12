package service;

import entity.Despesa;

import java.util.List;

public class GerenciadorDespesas {

    public void listarAllDespesas(List<Despesa> despesa){
        int i = 1;
        for(Despesa ds : despesa){
            System.out.println("Despesa " + i +
                    "Data: " + ds.getData() +
                    "Valor: " + ds.getValor() +
                    "Descrição: " + ds.getDescricao() +
                    "Status paga: " + ds.isStatus());
        }

    }
}
