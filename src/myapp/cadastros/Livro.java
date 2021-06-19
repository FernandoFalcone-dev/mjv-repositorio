package myapp.cadastros;
public class Livro extends Produto {
    private Cadastro editora;
    private Integer paginas;

    public Cadastro getEditora() {
        return this.editora;
    }

    public void setEditora(Cadastro editora) {
        this.editora = editora;
    }

    public Integer getPaginas() {
        return this.paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

}
