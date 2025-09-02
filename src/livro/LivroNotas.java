package livro;

public class LivroNotas {

    private String nomeCurso;

    public LivroNotas(String nome) {
        nomeCurso = nome;
    }

    public LivroNotas() {

    }

    public void setNomeCurso(String nome) {
        nomeCurso = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void exibirBoasVindas() {
        System.out.println("Bem-vindo ao livro de notas do curso " + nomeCurso + "!" + nomeCurso.length());
    }

}
