package velha;

public class Tabuleiro {

    private String[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new String[][]{{"-", "-", "-"},{"-", "-", "-"},{"-", "-", "-"}};
    }

    public boolean realizarJogada(Jogada jogada) {
        if (jogadaValida(jogada)) {
            tabuleiro[jogada.getLinha()][jogada.getColuna()] = jogada.getValor();
            return true;
        } else {
            return false;
        }
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

    public boolean jogadaValida(Jogada jogada) {
        return jogada.getColuna() <= 2
                && jogada.getColuna() >= 0
                && jogada.getLinha() >= 0
                && jogada.getLinha() <= 2
                && tabuleiro[jogada.getLinha()][jogada.getColuna()].equals("-");
    }
    
    public String checaVencedor() {
        if (checaVencedor("X")){
            return "X";
        } else if (checaVencedor("O")) {
            return "O";
        } else if (tabuleiroCheio()){
            return "empate";
        } else {
            return "aberto";
        }
    }

    public boolean tabuleiroCheio() {
        for (String[] linha : tabuleiro) {
            for (String posicao : linha) {
                if (posicao.equals("-")) {
                    return false;
                }
            }
        }

        return true;
    }
    
    public boolean checaVencedor(String jogador){
        if (tabuleiro[0][0].equals(jogador)
                && tabuleiro[0][1].equals(jogador)
                && tabuleiro[0][2].equals(jogador)) {
            return true;
        } else if (tabuleiro[1][0].equals(jogador)
                && tabuleiro[1][1].equals(jogador)
                && tabuleiro[1][2].equals(jogador)) {
            return true;
        } else if (tabuleiro[2][0].equals(jogador)
                && tabuleiro[2][1].equals(jogador)
                && tabuleiro[2][2].equals(jogador)) {
            return true;
        } else if (tabuleiro[0][0].equals(jogador)
                && tabuleiro[1][0].equals(jogador)
                && tabuleiro[2][0].equals(jogador)) {
            return true;
        } else if (tabuleiro[0][1].equals(jogador)
                && tabuleiro[1][1].equals(jogador)
                && tabuleiro[2][1].equals(jogador)) {
            return true;
        } else if (tabuleiro[0][2].equals(jogador)
                && tabuleiro[1][2].equals(jogador)
                && tabuleiro[2][2].equals(jogador)) {
            return true;
        } else if (tabuleiro[0][0].equals(jogador)
                && tabuleiro[1][1].equals(jogador)
                && tabuleiro[2][2].equals(jogador)) {
            return true;
        } else if (tabuleiro[0][2].equals(jogador)
                && tabuleiro[1][1].equals(jogador)
                && tabuleiro[2][0].equals(jogador)) {
            return true;
        } else {
            return false;
        }
    }

}
