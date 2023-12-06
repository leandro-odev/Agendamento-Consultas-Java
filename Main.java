import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de agendamento de consulta.");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o numero correspondente para a operacao necessaria:");
            System.out.println("1- Agendar consulta\n2- Verificar consultas marcadas\n3- Acesso administrativo\nOutro- Sair");
            int op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Agendar");
                case 2:
                    System.out.println("Printar");
                case 3:
                    System.out.println("Adm");
                default:
                    break;
            }
        }
        input.close();
    }
}
