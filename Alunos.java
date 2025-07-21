public class Alunos extends Pessoas{

int matricula;
String curso;
String seriePeriodo;
int frequencia;
double mediaFinal;

Alunos(){}

Alunos(String nome, int idade, double peso, double altura, String sexo, int matricula, String curso, String seriePeriodo, int frequencia, double mediaFinal){
super(nome, idade, peso, altura, sexo);
this.matricula = matricula;
this.curso = curso;
this.seriePeriodo = seriePeriodo;
this.frequencia = frequencia;
this.mediaFinal = mediaFinal;
}


public int getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }
    public String getSeriePeriodo(){
        return seriePeriodo;
    }
    public int getFrequencia(){
        return frequencia;
    }
    public double getMediaFinal(){
        return mediaFinal;
    }

public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
         this.curso = curso;
    }
    public void setSeriePeriodo(String seriePeriodo){
      this.seriePeriodo = seriePeriodo;
    }
    public void setFrequencia(int frequencia){
      this.frequencia = frequencia;
    }
    public void setMediaFinal(double mediaFinal){
      this.mediaFinal = mediaFinal;
    }

    @Override
    public void Falar(){
        System.out.println("O aluno esta tirando uma duvida...");
    }
    @Override
    public void Andar(){
        System.out.println("O aluno esta caminhando para sala de aula...");
    }
    @Override
    public void Trabalhar(){
        System.out.println("O aluno esta fazendo uma atividade escolar...");
    }












}