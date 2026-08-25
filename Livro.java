public class Livro extends Item {
    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void emprestar() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }
}