
package Prova_Silv_2;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    
    //Atributos
    private String carteiraDeHabilitacao;

    //Construtor
    public Motoboy(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
               "\nCargo: Motoboy " + 
               "\nCarteira de Habilitação: " + carteiraDeHabilitacao +
               "\nSalário Final: " + Util.formatarMonetario(getSalarioFinal());
    }
    
    
    //Métodos
    @Override
    public double getSalarioFinal() {
        return super.salario;
    }

    //Getters and Setters
    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    
    
    
}
