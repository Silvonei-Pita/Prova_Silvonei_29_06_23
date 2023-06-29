
package Prova_Silv_2;


public class Endereco {
    
    //Atributos
    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa uf;

    //Construtor
    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    //toString
    @Override
    public String toString() {
        return "\n  Logradouro: " + logradouro + 
               "\n  Número: " + numero + 
               "\n  Complemento: " + complemento + 
               "\n  CEP: " + cep + 
               "\n  Cidade: " + cidade + 
               "\n  Unidade Federativa: " + uf.getNome();
    }
    
    

    //Getters and Setters
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
    
    
    
    
    
    
}
