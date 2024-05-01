package lanchedajack;

public class ComboImpl implements Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;

    @Override
    public void criarCombo(int tipo) {
        switch (tipo) {
            case 1:
                this.sanduiche = new Sanduiche("Burger Master");
                this.sobremesa = new Sobremesa("Sundae");
                this.bebida = new Bebida("Coca-Cola");
                break;
            case 2:
                this.sanduiche = new Sanduiche("Super Burger");
                this.sobremesa = new Sobremesa("Brownie");
                this.bebida = new Bebida("Pepsi");
                break;
            default:
                throw new IllegalArgumentException("Tipo de combo inválido");
        }
    }

    @Override
    public String toString() {
        if (sanduiche != null && sobremesa != null && bebida != null) {
            return "Combo: " + sanduiche.getNome() + ", " + sobremesa.getNome() + ", " + bebida.getNome();
        } else {
            return "Combo n?o criado";
        }
    }
}
