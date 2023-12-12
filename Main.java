import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de agendamento de consulta.");
        Agenda agenda = new Agenda();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o numero correspondente para a operacao necessaria:");
            System.out.println("1- Agendar consulta\n2- Verificar consultas marcadas\n3- Acesso administrativo\nOutro- Sair");
            String op = input.nextLine();
            switch (op) {
                case "1":
                    agenda.agendarConsulta();
                    break;
                case "2":
                    agenda.printConsultas();
                    break;
                case "3":
                    System.out.println("Escolhe a operacao administrativa escolhida:");
                    System.out.println("1- Adicionar paciente\n2- Remover paciente\n3-Aidiconar medico\n4- Remover medico\n5- Trocar senha\n6- Verificar pacientes e medicos\nOutro- Sair");
                    String opp = input.nextLine();
                    switch (opp) {
                        case "1":
                            agenda.addPaciente();
                            break;
                        case "2":
                            agenda.removePaciente();
                            break;
                        case "3":
                            agenda.addMedico();
                            break;
                        case "4":
                            agenda.removeMedico();
                            break;
                        case "5":
                            agenda.trocarSenha();
                            break;
                        case "6":
                            agenda.printPessoas();
                            break;
                    }
            }
            if (!op.equals("1") || !op.equals("2") || !op.equals("3")) {
                break;
            }
        }
    }
}