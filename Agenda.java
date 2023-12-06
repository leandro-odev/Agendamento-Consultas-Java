import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Paciente> pacienteList = new ArrayList<>();
    private ArrayList<Medico> medicoList = new ArrayList<>();
    private String senha = "adm123";

    public void addPaciente() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha de adm:");
        String senha_digitada = input.nextLine();
        if (!senha_digitada.equals(senha)) {
            input.close();
            return;
        }
        System.out.println("Agora digite as informacoes pedidas do paciente ");
        System.out.println("Nome:");
        String nome = input.nextLine();
        System.out.println("Cpf:");
        String cpf = input.nextLine();
        System.out.println("Cartao Sus:");
        String cartaoSus = input.nextLine();
        System.out.println("Tipo de atendimento:");
        String atendimento = input.nextLine();
        Paciente p = new Paciente(nome, cpf, cartaoSus, atendimento);
        pacienteList.add(p);
        input.close();
    }

    public void addMedico() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha de adm:");
        String senha_digitada = input.nextLine();
        if (!senha_digitada.equals(senha)) {
            input.close();
            return;
        }
        System.out.println("Agora digite as informacoes pedidas do medico ");
        System.out.println("Nome:");
        String nome = input.nextLine();
        System.out.println("Cpf:");
        String cpf = input.nextLine();
        System.out.println("CRM:");
        String crm = input.nextLine();
        System.out.println("Especialidade:");
        String especialidade = input.nextLine();
        System.out.println("Salario:");
        float salario = input.nextFloat();
        Medico m = new Medico(nome, cpf, crm, especialidade, salario);
        medicoList.add(m);
        input.close();
    }

    public void removePaciente() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha de adm:");
        String senha_digitada = input.nextLine();
        if (!senha_digitada.equals(senha)) {
            input.close();
            return;
        }
        System.out.println("Digite o CPF ou Cartao Sus do paciente que deseja remover:");
        String cpf = input.nextLine();
        for(int i = 0; i < pacienteList.size(); i++) {
            if(pacienteList.get(i).getCpf() == cpf || pacienteList.get(i).getCartaoSus() == cpf) {
                pacienteList.remove(i);
                System.out.println("Paciente removido com sucesso!");
                input.close();
                break;
            }
        }
        System.out.println("Paciente nao encontrado. Voltando ao menu inicial.");
        input.close();
    }

    public void removeMedico() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha de adm:");
        String senha_digitada = input.nextLine();
        if (!senha_digitada.equals(senha)) {
            input.close();
            return;
        }
        System.out.println("Digite o CPF ou CRM do medico que deseja remover:");
        String cpf = input.nextLine();
        for(int i = 0; i < medicoList.size(); i++) {
            if(medicoList.get(i).getCpf() == cpf || medicoList.get(i).getCrm() == cpf) {
                medicoList.remove(i);
                System.out.println("Medico removido com sucesso!");
                input.close();
                break;

            }
        }
        System.out.println("Medico nao encontrado. Voltando ao menu inicial.");
        input.close();
    }

    public void trocarSenha() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha atual:");
        String senha_digitada = input.nextLine();
        while (true) {
            if (senha_digitada == senha) {
                System.out.println("Digite a nova senha:");
                senha = input.nextLine();
                System.out.println("A senha agora é " + senha);
                break;
            }
            else {
                System.out.println("Senha errada, digite novamente a senha, ou clique enter.");
                senha_digitada = input.nextLine();
                if(senha_digitada.isEmpty()) {
                    break;
                }
            }
        }
        input.close();
    }
}