package composite;

public class Livraria {

    private Informacao informacao;

    public void setInformacao(Informacao informacao) {
        this.informacao = informacao;
    }

    public String getInformacao() {
        if (this.informacao == null) {
            throw new NullPointerException("Livro sem informacao");
        }
        return this.informacao.getInformacao();
    }
}



