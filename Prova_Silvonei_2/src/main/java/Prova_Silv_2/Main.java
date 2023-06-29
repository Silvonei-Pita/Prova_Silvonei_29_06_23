
package Prova_Silv_2;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        
        //Instanciar Objetos
            //Engenheiro
        Engenheiro engenheiro1 = new Engenheiro("2143336633", 
                "Marcos", 
                "153.646.964-12", 
                "63.642.423-12", 
                new Endereco("Avenida San Martin", 
                        "48",
                        "Perto da Não Negocie!", 
                        "42275-370", 
                        "Salvador", 
                        UnidadeFederativa.BAHIA), 
                Setor.ENGENHARIA, 
                Genero.MASCULINO, 5000.45, 
                EstadoCivil.CASADO, 
                LocalDate.of(1990, Month.MARCH, 30));
        
            //Motoboy 
        Motoboy motoboy1 = new Motoboy("855343175", 
                "Leandro", 
                "436.531.313-64", 
                "52.533.212-42", 
                new Endereco("Parque da Jucélia", 
                        "77", 
                        "Em frente à Não Desista", 
                        "3513-422", 
                        "Rio de Janeiro", 
                        UnidadeFederativa.RIO_DE_JANEIRO), 
                Setor.OPERACOES, 
                Genero.MASCULINO, 
                3000.34, 
                EstadoCivil.SOLTEIRO, 
                LocalDate.of(1988, Month.APRIL, 28));
        
            //Gerente
        Gerente gerente1 = new Gerente(Bonificacao.GERENTE, 
                "Larissa", 
                "481.523.832-32", 
                "34.766.121-31", 
                new Endereco("Rua das Flores", 
                        "22", 
                        "1° Andar", 
                        "83146-12", 
                        "São Paulo", 
                        UnidadeFederativa.SAO_PAULO), 
                Setor.RECURSOS_HUMANOS, 
                Genero.FEMININO, 
                7000, 
                EstadoCivil.CASADO, 
                LocalDate.of(1986, Month.DECEMBER, 7));
        
        
            //Diretor
        Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, 
                "Silvonei", 
                "732.678.123-53", 
                "21.775.853-76", 
                new Endereco("Bairro dos Céus", 
                        "7", 
                        "1° andar, perto da Loja da Disciplina", 
                        "55324-21", 
                        "Salvador", 
                        UnidadeFederativa.BAHIA), 
                Setor.MARKETING, 
                Genero.MASCULINO, 
                7000, 
                EstadoCivil.CASADO, 
                LocalDate.of(1984, Month.JUNE, 18));
        
        //Exibir dados
            //Gerente
            System.out.println(gerente1.toString());
            System.out.println("");
            System.out.println("-----------------------------------");
            //Diretor
            System.out.println(diretor1.toString());
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("Ações realizadas pelo Diretor no dia 29/06/2023");
            System.out.println("");
            //Admitir Engenheiro
            diretor1.admitir(engenheiro1);
            System.out.println("");
            System.out.println("***********************************************");
            //Demissão do Motoboy
            diretor1.demitir(motoboy1);
        
        
        
        
        
        
        
    }
    
}
