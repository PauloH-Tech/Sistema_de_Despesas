package service;

import entity.Despesa;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDespesas {
    private List<Despesa> despesas;
    private FileManager fileManager;

    public GerenciadorDespesas() {
        this.fileManager = new FileManager();
        this.despesas = fileManager.carregarDespesas();
    }

    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
        fileManager.salvarDespesas(despesas);
        System.out.println("✅ Despesa cadastrada com sucesso!");
    }

    public void listarAllDespesas() {
        if (despesas.isEmpty()) {
            System.out.println("📭 Nenhuma despesa cadastrada.");
            return;
        }

        System.out.println("\n📋 TODAS AS DESPESAS:");
        int i = 1;
        for(Despesa ds : despesas){
            String status = ds.isStatus() ? "✅ PAGA" : "❌ PENDENTE";
            System.out.println(i + ". Data: " + ds.getData() +
                    " | Valor: R$ " + String.format("%.2f", ds.getValor()) +
                    " | Descrição: " + ds.getDescricao() +
                    " | Status: " + status);
            i++;
        }
    }

    public void listarDespesasEmAberto() {
        List<Despesa> emAberto = despesas.stream()
                .filter(d -> !d.isStatus())
                .toList();

        if (emAberto.isEmpty()) {
            System.out.println("🎉 Nenhuma despesa em aberto!");
            return;
        }

        System.out.println("\n📋 DESPESAS EM ABERTO:");
        int i = 1;
        for(Despesa ds : emAberto){
            System.out.println(i + ". Data: " + ds.getData() +
                    " | Valor: R$ " + String.format("%.2f", ds.getValor()) +
                    " | Descrição: " + ds.getDescricao());
            i++;
        }
    }

    public void listarDespesasPagas() {
        List<Despesa> pagas = despesas.stream()
                .filter(Despesa::isStatus)
                .toList();

        if (pagas.isEmpty()) {
            System.out.println("📭 Nenhuma despesa paga encontrada.");
            return;
        }

        System.out.println("\n📋 DESPESAS PAGAS:");
        int i = 1;
        for(Despesa ds : pagas){
            System.out.println(i + ". Data: " + ds.getData() +
                    " | Valor: R$ " + String.format("%.2f", ds.getValor()) +
                    " | Descrição: " + ds.getDescricao());
            i++;
        }
    }

    public void marcarComoPaga(int indice) {
        if (indice >= 0 && indice < despesas.size()) {
            Despesa despesa = despesas.get(indice);
            if (!despesa.isStatus()) {
                despesa.setStatus(true);
                fileManager.salvarDespesas(despesas);
                System.out.println("✅ Despesa marcada como paga!");
            } else {
                System.out.println("⚠️ Esta despesa já está paga.");
            }
        } else {
            System.out.println("❌ Índice inválido!");
        }
    }

    public List<Despesa> getDespesas() {
        return new ArrayList<>(despesas);
    }
}