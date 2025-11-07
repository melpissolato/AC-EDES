package ac20;

public class Main {
    public static void main(String[] args) {


        Instrutor instrutor1 = new Instrutor("Carlos Silva", "Programação Java");
        Instrutor instrutor2 = new Instrutor("Mariana Souza", "Banco de Dados");


        Curso curso1 = new Curso("Programação Orientada a Objetos", "POO");
        Curso curso2 = new Curso("Banco de Dados Relacional", "BDR");
        Curso curso3 = new Curso("Estruturas de Dados", "ED");

        curso1.setInstrutor(instrutor1);
        curso2.setInstrutor(instrutor2);
        curso3.setInstrutor(instrutor1);

        Aluno aluno1 = new Aluno(101, "Ana Costa", "ana@email.com");
        Aluno aluno2 = new Aluno(102, "Bruno Lima", "bruno@email.com");
        Aluno aluno3 = new Aluno(103, "Clara Mendes", "clara@email.com");
        Aluno aluno4 = new Aluno(104, "Diego Torres", "diego@email.com");
        Aluno aluno5 = new Aluno(105, "Eduarda Rocha", "eduarda@email.com");

        curso1.matricularAluno(aluno1);
        curso1.matricularAluno(aluno2);
        curso1.matricularAluno(aluno3);

        curso2.matricularAluno(aluno2);
        curso2.matricularAluno(aluno4);

        curso3.matricularAluno(aluno1);
        curso3.matricularAluno(aluno3);
        curso3.matricularAluno(aluno5);

        System.out.println("===== CURSOS CADASTRADOS =====");
        Curso[] cursos = { curso1, curso2, curso3 };

        for (Curso c : cursos) {
            System.out.println("\nCurso: " + c.getNome() + " (" + c.getSigla() + ")");
            System.out.println("Instrutor: " + c.getInstrutor().getNome() + " - " + c.getInstrutor().getEspecialidade());
            System.out.println("Alunos matriculados:");
            for (Aluno a : c.getAlunosMatriculados()) {
                System.out.println(" - " + a.getNome() + " | Matrícula: " + a.getMatricula());
            }
        }
    }
}
