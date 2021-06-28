package com.fernando.util;

import java.util.Collections;
import java.util.StringJoiner;

public class JDBCUtil {
    public static String insertUpdate(TipoOperacao tipo, String table, String ... fields) {
        if(tipo == TipoOperacao.INSERT)
            return insert(table, fields);
        else if(tipo == TipoOperacao.UPDATE)
            return update(table, fields);
        return "NÃO IMPLEMENTADO";
    }

    public static String insert(String table, String ... fields) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(String.join(", ", fields));
        sb.append("VALUES (");
        sb.append(String.join(", ", Collections.nCopies(fields.length, "?")));
        sb.append(");");
        return sb.toString();
    }

    public static String update(String table, String ... fields) {
        StringBuilder sb = new StringBuilder(String.format("UPDATE %s SET ", table));
        StringJoiner set = new StringJoiner(",", "", " = ?");
        set.add(String.join("= ?, ", fields));

        sb.append(set.toString());
        return sb.toString();    
    }

    public static String delete(String table, String fieldCodigo){
        return String.format("DELETE FROM %s WHERE %s = ?", table, fieldCodigo);
    }

    public static String selectSpecific(String table, String fieldCodigo){
        return String.format("SELECT * FROM %s WHERE %s = ?", table, fieldCodigo);
    }

    public static String select(String table) {
        return String.format("SELECT * FROM", table);
    }
    
    //Testando a classe
    public static void main(String[] args) {
        String tabela = "tab_cliente";
        String campos [] = {"codigo","pf_pj", "razao_social_nome", "cpf_cnpj", "telefone1", "email", "atividade_prof", "cep", "estado", "cidade", "rua", "numero", "complemento", "bairro", "site_instagram"};
       /*  String insert = insert(tabela, campos);
        System.out.println(insert); */

        String update = update(tabela, campos);
        System.out.println(update);
    }
}
