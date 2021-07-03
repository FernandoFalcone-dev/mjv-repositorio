package com.fernando.cadastro.controller;

import java.util.List;

import com.fernando.cadastro.model.Cadastro;
import com.fernando.cadastro.repository.CadastroDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {
    @Autowired
    private CadastroDao cadastroDao;

    @GetMapping(value = "/")
    public List<Cadastro> listagemCadastros(){
        return cadastroDao.listAll();
    }
}
