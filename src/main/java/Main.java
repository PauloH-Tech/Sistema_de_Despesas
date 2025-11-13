import entity.Despesa;
import service.GerenciadorDespesas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static GerenciadorDespesas gerenciador = new GerenciadorDespesas();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n===== 💰 SISTEMA DE CONTROLE DE DESPESAS =====");
            System.out.println("1. ➕ Entrar despesa");
            System.out.println("2. 💳 Anotar pagamento");
            System.out.println("3. 📋 Listar despesas em aberto");
            System.out.println("4. ✅ Listar despesas pagas");
            System.out.println("5. 📊 Listar todas as despesas");
            System.out.println("6. 🏷️ Gerenciar tipos de despesa");
            System.out.println("7. 👤 Gerenciar usuário");
            System.out.println("0. 🚪 Sair");
            System.out.print("Digite uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine(); // Limpar buffer
            } catch (InputMismatchException e) {
                opcao = -1;
                sc.nextLine(); // Limpar entrada inválida
            }

            switch (opcao) {
                case 1:
                    cadastrarDespesa();
                    break;
                case 2:
                    anotarPagamento();
                    break;
                case 3:
                    gerenciador.listarDespesasEmAberto();
                    break;
                case 4:
                    gerenciador.listarDespesasPagas();
                    break;
                case 5:
                    gerenciador.listarAllDespesas();
                    break;
                case 6:
                    System.out.println("🛠️ Funcionalidade em desenvolvimento...");
                    break;
                case 7:
                    System.out.println("🛠️ Funcionalidade em desenvolvimento...");
                    break;
                case 0:
                    System.out.println("👋 Saindo... Até logo!");
                    break;
                default:
                    System.out.println("❌ Código inválido!!");
            }

        } while (opcao != 0);
        sc.close();
    }

    private static void cadastrarDespesa() {
        System.out.println("\n➕ NOVA DESPESA:");

        try {
            System.out.print("Digite o valor da despesa: R$ ");
            double valor = sc.nextDouble();
            sc.nextLine(); // Limpar buffer

            System.out.print("Digite a data da despesa (dd/MM/yyyy): ");
            String data = sc.nextLine();

            System.out.print("Digite a descrição da despesa: ");
            String descricao = sc.nextLine();

            System.out.print("A despesa foi paga? (s/n): ");
            String st = sc.nextLine();
            boolean status = st.equalsIgnoreCase("s");

            Despesa despesa = new Despesa(valor, data, descricao, status);
            gerenciador.adicionarDespesa(despesa);

        } catch (InputMismatchException e) {
            System.out.println("❌ Valor inválido! Use números para o valor.");
            sc.nextLine(); // Limpar entrada inválida
        }
    }

    private static void anotarPagamento() {
        System.out.println("\n💳 ANOTAR PAGAMENTO:");
        gerenciador.listarDespesasEmAberto();

        var despesasEmAberto = gerenciador.getDespesas().stream()
                .filter(d -> !d.isStatus())
                .toList();

        if (despesasEmAberto.isEmpty()) {
            return;
        }

        try {
            System.out.print("Digite o número da despesa a marcar como paga: ");
            int numero = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            if (numero > 0 && numero <= despesasEmAberto.size()) {
                // Encontrar o índice real na lista completa
                Despesa despesaSelecionada = despesasEmAberto.get(numero - 1);
                int indiceReal = gerenciador.getDespesas().indexOf(despesaSelecionada);
                gerenciador.marcarComoPaga(indiceReal);
            } else {
                System.out.println("❌ Número inválido!");
            }
        } catch (InputMismatchException e) {
            System.out.println("❌ Digite um número válido!");
            sc.nextLine(); // Limpar entrada inválida
        }
    }
}