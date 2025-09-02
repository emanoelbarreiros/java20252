package livro;

public class Aluno {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeAluno) {
        if (nomeAluno.length() < 20 && nomeAluno.length() > 0) {
            nome = nomeAluno;
        }
    }
}
