package lanchedajack;

public class Sanduiche {
    private String nome;
    private int gramas;

    public Sanduiche(String nome, int gramas) {
        this.nome = nome;
        this.gramas = gramas;
    }

    public String getNome() {
        return nome;
    }
    
    public int getGramas() {
        return gramas;
    }
}
