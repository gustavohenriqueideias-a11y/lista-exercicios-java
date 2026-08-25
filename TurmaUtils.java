public class TurmaUtils {

    public static Estudante[] obterAprovados(Estudante[] estudantes) {
        if (estudantes == null || estudantes.length == 0) {
            return null;
        }

        int contAprovados = 0;
        for (Estudante e : estudantes) {
            if (e != null && e.calculaMedia() >= 6.0) {
                contAprovados++;
            }
        }

        if (contAprovados == 0) {
            return null;
        }

        Estudante[] aprovados = new Estudante[contAprovados];
        int index = 0;
        for (Estudante e : estudantes) {
            if (e != null && e.calculaMedia() >= 6.0) {
                aprovados[index] = e;
                index++;
            }
        }

        return aprovados;
    }
}