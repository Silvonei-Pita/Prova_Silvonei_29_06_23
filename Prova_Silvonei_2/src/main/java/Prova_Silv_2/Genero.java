
package Prova_Silv_2;

public enum Genero {
    
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");
    
    private final char caractere;
    private final String texto;

    private Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
