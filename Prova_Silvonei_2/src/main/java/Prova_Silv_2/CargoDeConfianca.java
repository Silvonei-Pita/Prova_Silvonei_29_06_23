
package Prova_Silv_2;

import java.time.LocalDate;


public abstract class CargoDeConfianca extends Funcionario{
    
    //Atributos
    protected Bonificacao bonificacao;

    //Construtor
    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.bonificacao = bonificacao;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
               "\n\nPossui Cargo de Confiança. " + 
               "\nBonificação: +" + (bonificacao.getValor() * 100) + "%";
    }
    
    
    //Getters and Setters
    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    
    
    
    
}
