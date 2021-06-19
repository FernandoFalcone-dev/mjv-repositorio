package myapp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import myapp.cadastros.CD;
import myapp.cadastros.Cadastro;
import myapp.cadastros.Livro;
import myapp.factory.FabricaCadastro;
import myapp.pedido.Pedido;
import myapp.pedido.PedidoItem;

public class Main {
    public static void main(String[] args) throws Exception {

        Cadastro artista = FabricaCadastro.criarCadastro("JUSTIN TIMBERLAKE", "justin@gmail.com", 989576324L);

        CD cd1 = new CD();
        cd1.setArtista(artista);
        cd1.setCodigoBarras("s185156a6515185");
        cd1.setFaixa(20);
        cd1.setTitulo("Justified");
        cd1.setValorUnidade(180.00);

        artista = FabricaCadastro.criarCadastro("Bruno Mars", "BMars@outlook.com", 923874695L);
        
        CD cd2 = new CD();
        cd2.setArtista(artista);
        cd2.setCodigoBarras("d8461sfg516848");
        cd2.setFaixa(15);
        cd2.setTitulo("24k Magic");
        cd2.setValorUnidade(155.99);

        artista = FabricaCadastro.criarCadastro("William P. Young", "william@yahoo.com", 652314786L);
        Livro liv1 = new Livro();
        liv1.setEditora(artista);
        liv1.setCodigoBarras("sfs68s16516851");
        liv1.setPaginas(240);
        liv1.setTitulo("A cabana");
        liv1.setValorUnidade(25.0);

        Pedido pedido = new Pedido();
        Cadastro cliente = FabricaCadastro.criarCadastro("Fred", "fred@gmail.com", 985674321L);
        pedido.setCliente(cliente);
        pedido.setId(65846);
        pedido.setData(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z"));
        pedido.setValorTotal(230.0);

        List<PedidoItem> itens = new ArrayList<>();
        PedidoItem item = new PedidoItem();
        item.setProduto(cd1);
        item.setQuantidade(1.0);
        item.setValorUnidade(cd1.getValorUnidade());
        item.calcularValorTotal();;

        itens.add(item);

        item = new PedidoItem();
        item.setProduto(liv1);
        item.setQuantidade(2.0);
        item.setValorUnidade(liv1.getValorUnidade());
        item.calcularValorTotal();;

        itens.add(item);
        pedido.setItens(itens);
        
        
        System.out.println("Pedido Cliente " + pedido.getCliente().getNome());
		for(PedidoItem i: pedido.getItens()) {
			System.out.println(i.getProduto().getTitulo() + " " + i.getValorUnidade() + " " + i.getQuantidade() + " " + i.getValorTotal());
		}
        
        
        /*Empresa empresa = new Empresa();
        empresa.setCpfCnpj("291516518651");
        empresa.setIe(518648446L);
        empresa.setIm(161684611L);
        empresa.setEndereco("Rua Marques de Pombal - 1476 - Recife, PE");
        empresa.setCadastroEmp(empresa); */



    }
}
