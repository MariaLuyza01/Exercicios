public class SistemaPessoas{
    public static void main(String[] args){

   Pessoas pessoas = new Pessoas("Stefan", 23, 80.00, 1.90, "masculino"); 
pessoas.setNome("Stefan");
pessoas.setIdade(23);
pessoas.setPeso(80.00);
pessoas.setAltura(1.90);
pessoas.setSexo("masculino");  

Professor professor = new Professor(); 
professor.setNome("Alaric");
professor.setIdade(40);
professor.setPeso(80.00);
professor.setAltura(1.79);
professor.setSexo("masculino");
professor.setDisciplina("historia");
professor.setNivelEnsino("ensino médio");
professor.setSalario(4.800);
professor.setCargaHoraria(20);

Alunos alunos = new Alunos();
 alunos.setNome("Elena");
alunos.setIdade(17); 
alunos.setPeso(50.00);
alunos.setAltura(1.70);
alunos.setSexo("feminino");
alunos.setMatricula(20251234);
alunos.setCurso("ensino médio");
alunos.setSeriePeriodo("3° ano, período da tarde");
alunos.setFrequencia(80);
alunos.setMediaFinal(8.5);

String mensagem = "\nNome: "+pessoas.getNome()+
                  "\nIdade: "+pessoas.getIdade()+
                  "\nPeso: "+pessoas.getPeso()+
                  "\nAltura: "+pessoas.getAltura()+
                  "\nSexo: "+pessoas.getSexo();

String mensagem2 = "\nNome: "+professor.getNome()+
                   "\nIdade: "+professor.getIdade()+
                   "\nPeso: "+professor.getPeso()+
                   "\nAltura: "+professor.getAltura()+
                   "\nSexo: "+professor.getSexo()+
                   "\nDisciplina: "+professor.getDisciplina()+
                   "\nNivel de ensino: "+professor.getNivelEnsino()+
                   "\nSalario: "+professor.getSalario()+
                   "\nCarga horaria: "+professor.getCargaHoraria();

String mensagem3 = "\nNome: "+alunos.getNome()+
                   "\nIdade: "+alunos.getIdade()+
                   "\nPeso: "+alunos.getPeso()+
                   "\nAltura: "+alunos.getAltura()+
                   "\nSexo: "+alunos.getSexo()+
                   "\nMatricula: "+alunos.getMatricula()+
                   "\nCurso: "+alunos.getCurso()+
                   "\nSerie e periodo: "+alunos.getSeriePeriodo()+
                   "\nFrequencia: "+alunos.getFrequencia()+
                   "\nMedia final: "+alunos.getMediaFinal();

System.out.println("Pessoas: " + mensagem);
System.out.println(" ");
System.out.println("Professor: " + mensagem2);
System.out.println(" ");
System.out.println("Alunos: " + mensagem3);

    }
}