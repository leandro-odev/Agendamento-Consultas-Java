import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Paciente> pacienteList = new ArrayList<>();
    private ArrayList<Medico> medicoList = new ArrayList<>();
    public ArrayList<Consulta> consultas_marcadas = new ArrayList<>();
    
    private String senha = "adm123";

    public void agendarConsulta() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o CPF ou Cartao Sus do paciente:");
        String cpf = input.nextLine();
        
        Paciente paciente = null;
        while(true) {
            boolean paciente_encontrado = false;
            for(int i = 0; i < pacienteList.size(); i++) {
                if(pacienteList.get(i).getCpf().equals(cpf) || pacienteList.get(i).getCartaoSus().equals(cpf)) {
                    paciente_encontrado = true;
                    paciente = pacienteList.get(i);
                    break;
                }
            }
            if(!paciente_encontrado) {
                System.out.println("Paciente nao encontrado. Digite novamente o CPF ou Cartao Sus do paciente:");
                cpf = input.nextLine();
            } else break;
        }

        String exame = paciente.getAtendimento();
        Medico medico = null;
        boolean x = false;
        for(int i = 0; i < medicoList.size(); i++) {
            if(medicoList.get(i).getEspecialidade() == exame) {
                medico = medicoList.get(i);
                x =  true;
                break;
            }
        }
        if(x){
            System.out.println("Nao ha medico especializado para esse exame. Retornando ao menu inicial.");
            return;
        }

        while (true) {
            System.out.println("Digite a data da consulta");
            System.out.println("Dia:");
            String dia = input.nextLine();
            System.out.println("Mes:");
            String mes = input.nextLine();
            System.out.println("Ano:");
            String ano = input.nextLine();
            System.out.println("Digite o horario da consulta");
            System.out.println("Hora:");
            String hora = input.nextLine();
            System.out.println("Minuto:");
            String minuto = input.nextLine();
            
            boolean is_valid = true;
            for(int i = 0; i < consultas_marcadas.size(); i++) {
                if(consultas_marcadas.get(i).getDia() == dia && consultas_marcadas.get(i).getMes() == mes && consultas_marcadas.get(i).getAno() == ano && consultas_marcadas.get(i).getHora() == hora && consultas_marcadas.get(i).getMinuto() == minuto) {
                    System.out.println("Ja existe uma consulta marcada nesse horario. Digite novamente a data e horario da consulta.");
                    is_valid = false;
                    break;
                }
            }

            if (is_valid) {
                Consulta consulta = new Consulta(paciente, medico, dia, mes, ano, hora, minuto);
                consultas_marcadas.add(consulta);
                break;
            }
            
        }
    }

    public void printConsultas() {
        System.out.println("Lista de consultas:\n");
        for(int i = 0; i < consultas_marcadas.size(); i++) {
            System.out.println("Paciente: " + consultas_marcadas.get(i).getPaciente().getNome());
            System.out.println("Medico: " + consultas_marcadas.get(i).getMedico().getNome());
            System.out.println("Data: " + consultas_marcadas.get(i).getDia() + "/" + consultas_marcadas.get(i).getMes() + "/" + consultas_marcadas.get(i).getAno());
            System.out.println("Horario: " + consultas_marcadas.get(i).getHora() + ":" + consultas_marcadas.get(i).getMinuto());
            System.out.println("--------------------------------------------------");
        }
    }

    public void printPessoas() {
        System.out.println("Lista de pacientes:\n");
        for(int i = 0; i < pacienteList.size(); i++) {
            System.out.println(pacienteList.get(i).toString());
            System.out.println("--------------------------------------------------");
        }
        System.out.println("Lista de medicos:\n");
        for(int i = 0; i < medicoList.size(); i++) {
            System.out.println(medicoList.get(i).toString());
            System.out.println("--------------------------------------------------");
        }
    }

    public void addPaciente() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha de adm:");
        String senha_digitada = input.nextLine();
        // input.nextLine();
        if (!senha_digitada.equals(senha)) {
            return;
        }
        System.out.println("Agora digite as informacoes pedidas do paciente ");
        System.out.println("Nome:");
        String nome = input.nextLine();
        // input.nextLine();
        System.out.println("Cpf:");
        String cpf = input.nextLine();
        // input.nextLine();
        System.out.println("Cartao Sus:");
        String cartaoSus = input.nextLine();
        // input.nextLine();
        System.out.println("Tipo de atendimento:");
        String atendimento = input.nextLine();
        // input.nextLine();
        Paciente p = new Paciente(nome, cpf, cartaoSus, atendimento);
        pacienteList.add(p);
    }

    public void addMedico() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha de adm:");
        String senha_digitada = input.nextLine();
        // input.nextLine();
        if (!senha_digitada.equals(senha)) {
            return;
        }
        System.out.println("Agora digite as informacoes pedidas do medico ");
        System.out.println("Nome:");
        String nome = input.nextLine();
        // input.nextLine();
        System.out.println("Cpf:");
        String cpf = input.nextLine();
        // input.nextLine();
        System.out.println("CRM:");
        String crm = input.nextLine();
        // input.nextLine();
        System.out.println("Especialidade:");
        String especialidade = input.nextLine();
        // input.nextLine();
        System.out.println("Salario:");
        float salario = input.nextFloat();
        Medico m = new Medico(nome, cpf, crm, especialidade, salario);
        medicoList.add(m);
    }

    public void removePaciente() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha de adm:");
        String senha_digitada = input.nextLine();
        // input.nextLine();
        if (!senha_digitada.equals(senha)) {
            return;
        }
        System.out.println("Digite o CPF ou Cartao Sus do paciente que deseja remover:");
        String cpf = input.nextLine();
        // input.nextLine();
        for(int i = 0; i < pacienteList.size(); i++) {
            if(pacienteList.get(i).getCpf() == cpf || pacienteList.get(i).getCartaoSus() == cpf) {
                pacienteList.remove(i);
                System.out.println("Paciente removido com sucesso!");
                break;
            }
        }
        System.out.println("Paciente nao encontrado. Voltando ao menu inicial.");
    }

    public void removeMedico() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha de adm:");
        String senha_digitada = input.nextLine();
        // input.nextLine();
        if (!senha_digitada.equals(senha)) {
            return;
        }
        System.out.println("Digite o CPF ou CRM do medico que deseja remover:");
        String cpf = input.nextLine();
        // input.nextLine();
        for(int i = 0; i < medicoList.size(); i++) {
            if(medicoList.get(i).getCpf() == cpf || medicoList.get(i).getCrm() == cpf) {
                medicoList.remove(i);
                System.out.println("Medico removido com sucesso!");
                break;

            }
        }
        System.out.println("Medico nao encontrado. Voltando ao menu inicial.");
    }

    public void trocarSenha() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha atual:");
        String senha_digitada = input.nextLine();
        while (true) {
            if (senha_digitada.equals(senha)) {
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
    }

}