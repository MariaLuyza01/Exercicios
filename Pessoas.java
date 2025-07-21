public class Pessoas{
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String sexo;

Pessoas(){}

Pessoas(String nome, int idade, double peso, double altura, String sexo){
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
    
    public String getSexo(){
        return sexo;
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
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    
    public void Falar(){
        System.out.println("A pessoa esta conversando...");
    }
    
    public void Andar(){
        System.out.println("A pessoa esta caminhando...");
    }
  
    public void Trabalhar(){
        System.out.println("A pessoa esta trabalhando...");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    }























    
