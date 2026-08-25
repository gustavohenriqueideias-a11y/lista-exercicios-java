import java.util.Scanner;

public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    public void insereNotas() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            this.notas[i] = sc.nextDouble();
        }
    }

    public double calculaMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / 5.0;
    }

    public String getNome() {
        return this.nome;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public double menorNota() {
        double menor = this.notas[0];
        for (int i = 1; i < 5; i++) {
            if (this.notas[i] < menor) {
                menor = this.notas[i];
            }
        }
        return menor;
    }
}