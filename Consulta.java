public class Consulta {
    Paciente paciente;
    Medico medico;
    String dia, mes, ano;
    String hora, minuto;

    Consulta(Paciente paciente, Medico medico, String dia, String mes, String ano, String hora, String minuto) {
        this.paciente = paciente;
        this.medico = medico;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getAno() {
        return ano;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getMes() {
        return mes;
    }

    public String getMinuto() {
        return minuto;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
