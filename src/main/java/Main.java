import entity.Despesa;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=====SISTEMA DE CONTROLE DE DESPESAS======");
            System.out.println("1. Entrar despesa");
            System.out.println("2. Anotar pagamento");
            System.out.println("3. Listar despesas em aberto");
            System.out.println("4. Listar despesas pagas");
            System.out.println("5. Gerenciar tipos de despesa");
            System.out.println("6. Gerenciar usuário");
            System.out.println("0. Sair");
            System.out.print("Digite uma opção: ");

            //Tratamento de exceções para códigos inválidos
            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e){
                opcao = -1;
                sc.next();
            }

            switch (opcao){
                case 1:
                    System.out.print("Digite o valor da despesa: ");
                    var valor = sc.nextDouble();
                    System.out.print("Digite a data da despesa (dd/MM/yyy): ");
                    var data = sc.nextLine();
                    System.out.print("Digite a descrição da despesa: ");
                    var descricao = sc.nextLine();
                    System.out.print("A despesa foi paga (s/n): ");
                    var st = sc.nextLine();
                    boolean status = st == "s";
                    Despesa despesa = new Despesa(valor,data,descricao,status);
                    break;
                case 2:
                    System.out.println("Anotando pagamento");
                    break;
                case 3:
                    System.out.println("Listando despesas em aberto");
                    break;
                case 4:
                    System.out.println("Listando despesas pagas");
                    break;
                case 5:
                    System.out.println("Gerenciando tipos de despesa");
                    break;
                case 6:
                    System.out.println("Gerenciando usuário");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Código inválido!!");
            }

        } while (opcao != 0);


    }
}
