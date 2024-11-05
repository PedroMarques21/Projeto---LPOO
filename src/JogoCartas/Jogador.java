package JogoCartas;
import java.util.ArrayList;

public class Jogador {
	private int vida;
    private int mana;
    private ArrayList<Carta> deck;
    private ArrayList<Carta> mao;
    private ArrayList<Carta> cemiterio;

    public Jogador(int vidaInicial, int manaInicial) {
        this.vida = vidaInicial;
        this.mana = manaInicial;
        this.deck = new ArrayList<>();
        this.mao = new ArrayList<>();
        this.cemiterio = new ArrayList<>();
    }

    public void adicionarCartaAoDeck(Carta carta) {
        deck.add(carta);
    }

    public void comprarCarta() {
        if (!deck.isEmpty()) {
            mao.add(deck.remove(0));
        }
    }

    public void jogarCarta(Carta carta) {
        if (mana >= carta.getCustoMana()) {
            mana -= carta.getCustoMana();
            carta.usar();
            cemiterio.add(carta);
            mao.remove(carta);
        } else {
            System.out.println("Mana insuficiente para jogar " + carta.getNome());
        }
    }
}
