public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private float salario;

    Medico(String nomee, String cpff, String crmm, String especialidadee, float salarioo) {
        super(nomee, cpff);
        this.crm = crmm;
        this.especialidade = especialidadee;
        this.salario = salarioo;
    }
    
    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nCRM: " + getCrm() + "\nEspecialidade: " + getEspecialidade() + "\nSalario: " + getSalario();
    }
}
