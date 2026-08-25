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
        return soma / 5;
    }

    public double calculaMedia(int[] pesos) {
        double soma = 0;
        int somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            soma += this.notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        return soma / somaPesos;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public String getNome() {
        return this.nome;
    }

    public double menorNota() {
        double menor = this.notas[0];
        for (double nota : this.notas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }
}