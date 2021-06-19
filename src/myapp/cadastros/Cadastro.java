package myapp.cadastros;

public class Cadastro extends Endereco {
    private Integer id;
    private String nome;
    private Long telefone;
    private String email;
    

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
