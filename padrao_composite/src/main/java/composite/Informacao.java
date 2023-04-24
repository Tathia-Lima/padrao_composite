package composite;

public abstract class Informacao {

    private String info;

    public Informacao(String info) {
        this.info = info;
    }

    public String getCaracteristica() {
        return info;
    }

    public void setDescricao(String info) {
        this.info = info;
    }

    public abstract String getInformacao();
}
