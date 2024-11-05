package JogoCartas;

public class Criatura extends Carta {
	private int poder;
    private int resistencia;
    private String habilidade;

    public Criatura(String nome, int custoMana, int poder, int resistencia, String habilidade) {
        super(nome, custoMana);
        this.poder = poder;
        this.resistencia = resistencia;
        this.habilidade = habilidade;
    }

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getHabilidade() {
        return habilidade;
    }

    @Override
    public void usar() {
        System.out.println("Criatura " + getNome() + " é usada com habilidade " + habilidade);
    }
}
