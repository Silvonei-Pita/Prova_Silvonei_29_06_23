
package Prova_Silv_2;

import java.time.LocalDate;


public class Engenheiro extends Funcionario{
    
    //Atributos
    private String crea;

    //Construtor
    public Engenheiro(String crea, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.crea = crea;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Engenheiro " + 
                "\nCREA: " + crea +
                "\nSalário Final: " + Util.formatarMonetario(getSalarioFinal());
    }

 
    //Métodos
    @Override
    public double getSalarioFinal() {
        return super.salario;
    }
    
    //Getters and Setters
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    
    
    
    
}
