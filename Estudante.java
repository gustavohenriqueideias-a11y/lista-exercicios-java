public double calculaMedia(int[] pesos) {
        double soma = 0;
        int somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            soma += this.notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        return soma / somaPesos;
    }