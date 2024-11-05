package JogoCartas;

public class Encantamento extends Carta {
	private int poder;
    private int resistencia;
    private String efeitoContinuo;

    public Encantamento(String nome, int custoMana, int poder, int resistencia, String efeitoContinuo) {
        super(nome, custoMana);
        this.poder = poder;
        this.resistencia = resistencia;
        this.efeitoContinuo = efeitoContinuo;
    }

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getEfeitoContinuo() {
        return efeitoContinuo;
    }

    @Override
    public void usar() {
        System.out.println("Encantamento " + getNome() + " aplicado com efeito: " + efeitoContinuo +
                           ", poder: " + poder + ", resistência: " + resistencia);
    }
}
