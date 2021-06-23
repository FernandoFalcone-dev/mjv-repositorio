package myapp.cadastros;
public class Produto {
    Integer id;
    String codigoBarras;
    String titulo;
    Double valorUnidade;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValorUnidade() {
        return this.valorUnidade;
    }

    public void setValorUnidade(Double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

}

 