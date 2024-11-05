package JogoCartas;

public class Arena {
	private Jogador jogador1;
    private Jogador jogador2;

    public Arena(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void iniciarBatalha() {
        System.out.println("A batalha entre os jogadores começou!");
    }
}