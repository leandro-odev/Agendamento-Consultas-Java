public class Paciente extends Pessoa {
    private String cartaoSus;
    private String atendimento;

    Paciente(String nomee, String cpff, String cartaoSuss, String atendimentoo) {
        super(nomee, cpff);
        this.cartaoSus = cartaoSuss;
        this.atendimento = atendimentoo;
    }

    public String getAtendimento() {
        return atendimento;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nCartao SUS: " + getCartaoSus() + "\nTipo de atendimento: " + getAtendimento();
    }
}