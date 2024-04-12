public class Livro {
    private String nome;
    private String autor;
    private Double valor;
    private String resumo;
    private Double paginas;
//    private String tipoCapa;

    public Livro(){

    }

    public Livro(String nome, String autor, String resumo, Double valor, Double paginas) {
        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
        this.resumo = resumo;
        this.paginas = paginas;

    }

//    public String getTipoCapa() {
//        return tipoCapa;
//    }
//
//    public void setTipoCapa(String tipoCapa) {
//        this.tipoCapa = tipoCapa;
//    }

    public Double getPaginas() {
        return paginas;
    }

    public void setPaginas(Double paginas) {
        if (paginas <= 0)
            System.out.println("Páginas Invalidas");
        else
            this.paginas = paginas;
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