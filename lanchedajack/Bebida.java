package lanchedajack;

public class Bebida {
    private String nome;
    private int ml;

    public Bebida( String nome, int ml) {
        this.nome = nome;
           this.ml = ml;
    }

    public String getNome() {
        return nome;
    }

    public int getMl() {
        return ml;
    }
}