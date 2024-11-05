package JogoCartas;

public class Feitico extends Carta {
	private int poder;
    private int resistencia;
    private String efeito;

    public Feitico(String nome, int custoMana, int poder, int resistencia, String efeito) {
        super(nome, custoMana);
        this.poder = poder;
        this.resistencia = resistencia;
        this.efeito = efeito;
    }

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getEfeito() {
        return efeito;
    }

    @Override
    public void usar() {
        System.out.println("Feitiço " + getNome() + " é lançado com efeito: " + efeito +
                           ", poder: " + poder + ", resistência: " + resistencia);
    }
}