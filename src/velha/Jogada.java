package velha;

public class Jogada {

    private int coluna;
    private int linha;
    private String valor;

    public Jogada(int linha, int coluna, String valor) {
        this.coluna = coluna;
        this.linha = linha;
        this.valor = valor;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int y) {
        this.linha = linha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
