package myapp.pedido;

import java.text.SimpleDateFormat;
import java.util.List;

import myapp.cadastros.Cadastro;

public class Pedido {
    Integer id;
    SimpleDateFormat data;
    Double valorTotal;
    private Cadastro cliente;
    
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

    public List<PedidoItem> getItens() {
        return this.itens;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }

    

}
