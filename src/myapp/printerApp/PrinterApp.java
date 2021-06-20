package myapp.printerApp;

import java.text.SimpleDateFormat;

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
       sb.append(String.format("IM: %d", empresa.getIm()));

       SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
       String dataFormatada = formatador.format(pedido.getData());
       sb.append(dataFormatada);
    
       sb.append("------------------------------------------------------------------\n");
       sb.append(String.format("TOTAL %.2f", pedido.getValorTotal()));

       System.out.println(sb.toString());
       System.out.println("---------------------------------------------------------\n");
}
    

}
