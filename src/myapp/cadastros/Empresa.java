package myapp.cadastros;

public class Empresa extends Cadastro {

    private String cpfCnpj;
    private String endereco;
    private Long im;
    private Long ie;
    private Cadastro cadastroEmp;

    public String getCpfCnpj() {
        return this.cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Long getIm() {
        return this.im;
    }

    public void setIm(Long im) {
        this.im = im;
    }

    public Long getIe() {
        return this.ie;
    }

    public void setIe(Long ie) {
        this.ie = ie;
    }


    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public Cadastro getCadastroEmp() {
        return this.cadastroEmp;
    }

    public void setCadastroEmp(Cadastro cadastroEmp) {
        this.cadastroEmp = cadastroEmp;
    }


}
