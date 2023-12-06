public class Pessoa {
    private String nome;
    private String cpf;

    Pessoa(String nomee, String cpff) {
        this.nome = nomee;
        this.cpf = cpff;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
