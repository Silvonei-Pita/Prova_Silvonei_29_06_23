
package Prova_Silv_2;

import java.time.LocalDate;


public class Diretor extends CargoDeConfianca implements Contratacao{
    
    //Atributos
    private final double PREMIO = 0.3;

    //Construtor
    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() +
               "\nCargo: Diretor" + 
               "\nPrêmio: +" + (PREMIO * 100) + "%" +
               "\nSalário Final: " + Util.formatarMonetario(getSalarioFinal());
    }
    

    
    //Métodos
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario;
        salarioFinal += super.salario * this.PREMIO;
        salarioFinal += super.salario * super.bonificacao.getValor();
        return salarioFinal; 
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir funcionário: ");
        System.out.println("");
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("");
        System.out.println("Dados do funcionário admitido: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir funcionário: ");
        System.out.println("");
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("");
        System.out.println("Dados do funcionário demitido: ");
        System.out.println(funcionario.toString());
    }

   
    
    
    
    
    
    
}
