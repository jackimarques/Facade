package lanchedajack;

public class ComboImpl implements Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;

    @Override
    public void criarCombo(int tipo) {
        switch (tipo) {
            case 1:
                this.sanduiche = new Sanduiche("Burger Master", 500);
                this.sobremesa = new Sobremesa("Sundae", "pequeno");
                this.bebida = new Bebida("Coca-Cola", 600);
                break;
            case 2:
                this.sanduiche = new Sanduiche("Super Burger", 400);
                this.sobremesa = new Sobremesa("Brownie", "grande");
                this.bebida = new Bebida("Pepsi", 350);
                break;
            default:
                throw new IllegalArgumentException("Tipo de combo inválido");
        }
    }

    @Override
    public String toString() {
        if (sanduiche != null && sobremesa != null && bebida != null) {
            return "Combo: " + sanduiche.getNome() + " "+sanduiche.getGramas() +" gramas" +  ", " 
                    + sobremesa.getNome() + " tamanho: " + sobremesa.getTamanho() + ", " + bebida.getNome()
                    + " " + bebida.getMl() + " mls.";
        } else {
            return "Combo n?o criado";
        }
    }
}
