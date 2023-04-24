package composite;

public class Livro extends Informacao {

    private float preço;
    private String autor;

    public Livro(String info, float preço, String autor)  {
        super(info);
        this.preço = preço;
        this.autor = autor;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getInformacao() {
        return "Livro: " + this.getCaracteristica() + " - preço: " + this.preço + " - autor: " + this.autor + "\n";
    }

}