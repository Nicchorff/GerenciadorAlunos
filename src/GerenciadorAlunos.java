import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void addAluno(String nome, int matricula, double nota){
        alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(int matricula){
        Aluno aluno = null;
        for(Aluno a : alunos){
            if(a.getMatricula() == matricula){
                aluno = a;
                break;
            }
        }
        alunos.remove(aluno);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> listaDeAlunos = new TreeSet<>(alunos);
        return listaDeAlunos;
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> listaDeAlunos = new TreeSet<>(new ExibirAlunosPorNota());
        listaDeAlunos.addAll(alunos);
        return listaDeAlunos;
    }
}

