package myapp.cadastros;

public class Empresa{

    private Long im;
    private Long ie;
    private Cadastro cadastroEmp;


    public Empresa(Long im, Long ie) {
        this.im = im;
        this.ie = ie;
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

   public Cadastro getCadastroEmp() {
        return this.cadastroEmp;
    }

    public void setCadastroEmp(Cadastro cadastroEmp) {
        this.cadastroEmp = cadastroEmp;
    }


}
