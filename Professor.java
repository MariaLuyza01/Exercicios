public class Professor extends Pessoas{

private String disciplina;
private String nivelEnsino;
private double salario;
private int cargaHoraria;

Professor(){}

Professor(String nome, int idade, double peso, double altura, String sexo, String disciplina, String nivelEnsino, double salario, int cargaHoraria){

super(nome, idade, peso, altura, sexo);
this.disciplina = disciplina;
this.nivelEnsino = nivelEnsino;
this.salario = salario;
this.cargaHoraria = cargaHoraria;

}

public String getDisciplina(){
        return disciplina;
    }
    public String getNivelEnsino(){
        return nivelEnsino;
    }
    public double getSalario(){
        return salario;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }


public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public void setNivelEnsino(String nivelEnsino){
         this.nivelEnsino = nivelEnsino;
    }
    public void setSalario(double salario){
      this.salario = salario;
    }
    public void setCargaHoraria(int cargaHoraria){
      this.cargaHoraria = cargaHoraria;
    }


    @Override
    public void Falar(){
        System.out.println("O professor esta explicando a materia...");
    }
    @Override
    public void Andar(){
        System.out.println("O professor esta indo para sala de aula...");
    }
    @Override
    public void Trabalhar(){
        System.out.println("O professor esta corrigindo provas escolar...");
    }















}