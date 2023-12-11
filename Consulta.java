public class Consulta {
    String especialidade;
    Paciente paciente;
    Medico medico;
    int dia, mes, ano;
    int hora, minuto;

    Consulta(String especialidade, Paciente paciente, Medico medico, int dia, int mes, int ano, int hora, int minuto) {
        this.especialidade = especialidade;
        this.paciente = paciente;
        this.medico = medico;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public int getHora() {
        return hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public int getMes() {
        return mes;
    }

    public int getMinuto() {
        return minuto;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
