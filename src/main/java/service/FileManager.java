package service;

import entity.Despesa;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private static final String ARQUIVO_DESPESAS = "data/despesas.txt";

    public FileManager() {
        // Garante que a pasta data existe
        File pasta = new File("data");
        if (!pasta.exists()) {
            pasta.mkdirs();
        }
    }

    public void salvarDespesas(List<Despesa> despesas) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO_DESPESAS))) {
            for (Despesa despesa : despesas) {
                // Formato: valor|data|descricao|status
                writer.println(despesa.getValor() + "|" +
                        despesa.getData() + "|" +
                        despesa.getDescricao() + "|" +
                        despesa.isStatus());
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar despesas: " + e.getMessage());
        }
    }

    public List<Despesa> carregarDespesas() {
        List<Despesa> despesas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_DESPESAS))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split("\\|");
                if (partes.length == 4) {
                    double valor = Double.parseDouble(partes[0]);
                    String data = partes[1];
                    String descricao = partes[2];
                    boolean status = Boolean.parseBoolean(partes[3]);
                    despesas.add(new Despesa(valor, data, descricao, status));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de despesas não encontrado. Criando novo...");
        } catch (IOException e) {
            System.out.println("Erro ao carregar despesas: " + e.getMessage());
        }
        return despesas;
    }
}