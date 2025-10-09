package pessoa;

public class Pessoa implements Comparable<Pessoa> {
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

    @Override
    public int compareTo(Pessoa o) {
        return o.getNome().compareTo(this.nome);
        //return this.nome.compareTo(o.getNome());
    }

    public String toString() {
        return this.nome;
    }
}
