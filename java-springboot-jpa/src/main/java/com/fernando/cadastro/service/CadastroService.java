package com.fernando.cadastro.service;

import java.util.Optional;

import com.fernando.cadastro.exceptions.CampoObrigatorioException;
import com.fernando.cadastro.exceptions.RegistroNaoLocalizadoException;
import com.fernando.cadastro.model.Cadastro;
import com.fernando.cadastro.repository.CadastroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository repository;

    public void incluir(Cadastro cadastro) {
        if (cadastro.getCpf() == null) {
            throw new CampoObrigatorioException("CPF");
        }
        repository.save(cadastro);
    }
    public Cadastro buscar(Integer id) throws RegistroNaoLocalizadoException {
        Optional<Cadastro> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new RegistroNaoLocalizadoException("Cadastro", id);
        }
    }
}
