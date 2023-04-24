package composite;
import java.util.ArrayList;
import java.util.List;
public class Categoria extends Informacao {

    private List<Informacao> livros;

    public Categoria(String info) {
        super(info);
        this.livros = new ArrayList<Informacao>();
    }

    public void addInformacao(Informacao livro) {
        this.livros.add(livro);
    }

    public String getInformacao() {
        String saida = "";
        saida = "Categoria: " + this.getCaracteristica() + "\n";
        for (Informacao livro : livros) {
            saida += livro.getInformacao();
        }
        return saida;
    }
}