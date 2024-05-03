//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos g = new GerenciadorAlunos();

        g.addAluno("Pedro", 1, 10.0);
        g.addAluno("Lais", 2, 2.0);
        g.addAluno("Cristina", 3, 20.0);

        System.out.println(g.exibirAlunosPorNome());
        System.out.println(g.exibirAlunosPorNota());
        g.removerAluno(3);
        System.out.println(g.exibirAlunosPorNome());

    }
}