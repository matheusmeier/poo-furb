package models;

public class DVD extends ItemBiblioteca {
    
    public DVD(String titulo, int ano) {
        super(titulo, ano);
    }

    @Override 
    public int calcularPrazoEmprestimo() {
        return 15;
    }
}
