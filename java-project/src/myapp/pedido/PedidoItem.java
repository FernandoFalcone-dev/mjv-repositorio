package myapp.pedido;

import myapp.cadastros.Produto;

public class PedidoItem {
    private Integer id;
    private Double quantidade;
    private Double valorUnidade;
    private Double valorTotal;
    private Produto produto;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnidade() {
        return this.valorUnidade;
    }

    public void setValorUnidade(Double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

     public Double getValorTotal() {
        return this.valorTotal;
    }

   /* public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    } */

    public void calcularValorTotal(){
        this.valorTotal = this.valorUnidade * this.quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


}
