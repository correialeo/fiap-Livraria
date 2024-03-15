public class Livro {
    private String nome;
    private String autor;
    private Double valor;
    private String resumo;

    public Livro(){

    }

    public Livro(String nome, String autor, String resumo, Double valor) {
        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
        this.resumo = resumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
