package myapp;

import java.text.DateFormat;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Locale;

import myapp.cadastros.Empresa;
import myapp.cadastros.Endereco;
import myapp.pedido.Pedido;
import myapp.pedido.PedidoItem;

public class PrinterApp {
    public static String imprimirPedido(Pedido pedido){
    
       Empresa empresa = pedido.getEmpresa();

       Endereco e = empresa.getCadastroEmp().getEndereco();
       String cep = e.getCep().toString().replaceAll( ("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2-$3");

       StringBuilder sb = new StringBuilder();
       sb.append("----------------------------------------------------------------------\n");
       sb.append(String.format("%s .\n", empresa.getCadastroEmp().getNome()));
       sb.append(String.format("%s, %s, %s - %s - %s Cep: %s\n", e.getLogradouro(), e.getNumero(), e.getBairro(), e.getCidade(), e.getUf(), cep));
       sb.append(String.format("CNPJ: %s\n", empresa.getCadastroEmp().getCpfCnpj()));
       sb.append(String.format("IE: %s\nIM: %s\n",empresa.getIe().toString().replaceAll( ("(\\d{3})(\\d{3})(\\d{3})"), "$1.$2.$3"), 
				empresa.getIm().toString().replaceAll( ("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2.$3")));
       sb.append("----------------------------------------------------------------------\n");

       DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault()); 
       String dataFormatada = formatador.format(pedido.getData());

       //UMA LINHA DATA FORMATADA - CCF (6) DIGITOS - COO (6) DIGITOS
       sb.append(String.format("%-47s CCF:%06d CCO:%06d \n",  dataFormatada, pedido.getCcf(), pedido.getCoo()));
       sb.append(String.format("%20s\n", "CUPOM FISCAL"));
       sb.append(String.format("%s %7s %7s %7s %7s %7s %7s %7s\n", "ITEM", "CÓD.", "DESCR.", "QTD.", "UN.", "VL UNIT(R$)", "ST", "VL ITEM(R$)"));
       
       List<PedidoItem> itens = pedido.getItens();

       for (PedidoItem i: itens) {
           String cod = String.format("%.2f", i.getId());
           String q = String.format("%.2f", i.getQuantidade());
           String vu = String.format("%.2f", i.getValorUnidade());
           String vt = String.format("%.2f", i.getValorTotal());

           sb.append(String.format("%s %7s %7s %7s %7s %7s %12s %10s\n", 1, cod, i.getProduto().getTitulo(), q, "UN", vu, "T1", vt));

       }
    
       sb.append("\n----------------------------------------------------------------------\n");
       sb.append(String.format("%-60s %.2f", "TOTAL R$", pedido.getValorTotal()));

       return sb.toString();
}
    

}
