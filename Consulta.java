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
}
