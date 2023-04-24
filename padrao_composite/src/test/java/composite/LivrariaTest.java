package composite;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LivrariaTest {

    @Test
    void deveRetornarInfoLivro() {
        Categoria categoria1 = new Categoria("Fantasia");

        Categoria categoria2 = new Categoria("Ficção Científica");
        Livro categoria21 = new Livro("Frankenstein", 53.6f, "Mary Shelley");
        categoria2.addInformacao(categoria21);

        Categoria categoria3 = new Categoria("Infantil");
        Livro categoria31 = new Livro("Peter Pan", 40.7f, "James Matthew Barrie");
        Livro categoria32 = new Livro("Harry Potter e a Pedra Filosofal", 80.0f, "J.K. Rowling");
        categoria3.addInformacao(categoria31);
        categoria3.addInformacao(categoria32);

        Categoria informacao = new Categoria("Livros");
        informacao.addInformacao(categoria1);
        informacao.addInformacao(categoria2);
        informacao.addInformacao(categoria3);

        Livraria livro = new Livraria();
        livro.setInformacao(informacao);

        assertEquals("Categoria: Livros\n" +
                "Categoria: Fantasia\n" +
                "Categoria: Ficção Científica\n" +
                "Livro: Frankenstein - preço: 53.6 - autor: Mary Shelley\n" +
                "Categoria: Infantil\n" +
                "Livro: Peter Pan - preço: 40.7 - autor: James Matthew Barrie\n" +
                "Livro: Harry Potter e a Pedra Filosofal - preço: 80.0 - autor: J.K. Rowling\n", livro.getInformacao());
    }

    
    @Test
    void deveRetornarExecacaoLivroSemInformacao() {
        try {
            Livraria livro = new Livraria();
            livro.getInformacao();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Livro sem informacao", e.getMessage());
        }
    }
}
