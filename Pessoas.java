public class Pessoas{
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private boolean sexo;

Pessoas(String nome, int idade, double peso, double altura, boolean sexo){
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
    this.sexo = sexo;

}

public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }
 
    public double getAltura(){
        return altura;
    }
    
    public boolean getSexo(){
        return sexo;
    }
    }
 
    

public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
   
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setSexo(boolean Sexo){
        this.sexo = sexo;
    }























    
}