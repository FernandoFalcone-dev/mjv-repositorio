package myapp.printerApp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import myapp.cadastros.Empresa;
import myapp.pedido.Pedido;

public class PrinterApp {
    public static void imprimirPedido(Pedido pedido){
    
       Empresa empresa = pedido.getEmpresa();

       StringBuilder sb = new StringBuilder();
       sb.append(String.format("%s .\n", empresa.getCadastroEmp().getNome()));
       sb.append(String.format("%s, %d, %s - %s\n", empresa.getCadastroEmp().getLogradouro(), empresa.getCadastroEmp().getNumero(), empresa.getCadastroEmp().getCidade(), empresa.getCadastroEmp().getEstado()));
       sb.append(String.format("CNPJ: %s\n", empresa.getCadastroEmp().getCpfCnpj()));
       sb.append(String.format("IE: %d\n", empresa.getIe()));
       sb.append(String.format("IM: %d\n", empresa.getIm()));
       sb.append("------------------------------------------------------------------\n");

       DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault()); 
       String dataFormatada = formatador.format(pedido.getData());

       sb.append(String.format("%15s %15s %15s \n",  dataFormatada, pedido.getCcf(), pedido.getCoo()));
       sb.append(String.format("%20s\n", "CUPOM FISCAL"));
       sb.append(String.format("%5s %5s %5s %5s %5s %5s %5s %5s\n", "ITEM", "CÓD.", "DESCR.", "QTD.", "UN.", "VL UNIT(R$)", "ST", "VL ITEM(R$)"));
    
       sb.append("------------------------------------------------------------------\n");
       sb.append(String.format("TOTAL %.2f", pedido.getValorTotal()));

       System.out.println(sb.toString());
}
    

}
