
package Prova_Silv_2;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

    //Construtor
    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
               "\nCargo: Gerente" +
               "\nSalário Final: " + Util.formatarMonetario(getSalarioFinal());
    }

    //Métodos
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario;
        salarioFinal += super.salario * super.bonificacao.getValor();
        return salarioFinal;
        
    }

  
    
    
    
    
    
}
