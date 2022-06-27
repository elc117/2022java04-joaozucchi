public class Continente {

    protected String nome;
    protected int nPaises;

    public Continente(String nome, int nPaises) {
        this.nPaises = nPaises;
        this.nome = nome;
    }

    public int qntPaises() {
        return this.nPaises;
    }
}

// possíveis classes derivadas: Pais -> Estado -> Cidade -> Bairro
