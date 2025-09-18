package velha;

public class Tabuleiro {

    private String[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new String[][]{{"-", "-", "-"},{"-", "-", "-"},{"-", "-", "-"}};
    }

    public void realizarJogada(Jogada jogada) {
        tabuleiro[jogada.getLinha()][jogada.getColuna()] = jogada.getValor();
    }

    public void exibirTabuleiro() {
        for (String[] linha : tabuleiro) {
            System.out.print("| ");
            for (String valor: linha) {
                System.out.print(valor + " ");
            }
            System.out.println("|");
        }
    }

}
