package pessoa;

public class Pessoa {
    private String nome;

    public Pessoa(){}

    public Pessoa(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }
}
