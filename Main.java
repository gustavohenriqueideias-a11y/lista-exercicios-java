import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante[] turma = new Estudante[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome do estudante " + (i + 1) + ": ");
            String nome = sc.nextLine();
            turma[i] = new Estudante(nome);
            turma[i].insereNotas();
        }

        Estudante[] aprovados = TurmaUtils.obterAprovados(turma);

        System.out.println("\n--- ESTUDANTES APROVADOS ---");
        if (aprovados != null) {
            for (Estudante e : aprovados) {
                System.out.println("Nome: " + e.getNome() + " | Média: " + e.calculaMedia());
            }
        } else {
            System.out.println("Nenhum estudante foi aprovado.");
        }

        sc.close();
    }
}