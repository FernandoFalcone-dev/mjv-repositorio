package myapp.pedido;

import java.text.SimpleDateFormat;
import java.util.List;

import myapp.cadastros.Cadastro;
import myapp.cadastros.Empresa;

public class Pedido {
    private Integer id;
    private SimpleDateFormat data;
    private Double valorTotal;
    private Cadastro cliente;
    private Integer ccf;
    private Integer coo;
    private Empresa empresa;
    
    private List<PedidoItem> itens;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SimpleDateFormat getData() {
        return this.data;
    }

    public void setData(SimpleDateFormat data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cadastro getCliente() {
        return this.cliente;
    }

    public void setCliente(Cadastro cliente) {
        this.cliente = cliente;
    }


    public Integer getCcf() {
        return this.ccf;
    }

    public void setCcf(Integer ccf) {
        this.ccf = ccf;
    }

    public Integer getCoo() {
        return this.coo;
    }

    public void setCoo(Integer coo) {
        this.coo = coo;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    public List<PedidoItem> getItens() {
        return this.itens;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }

    

}
