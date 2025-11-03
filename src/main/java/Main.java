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
                    System.out.println("Entrando na despesa");
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
