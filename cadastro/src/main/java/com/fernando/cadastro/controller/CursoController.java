package com.fernando.cadastro.controller;

import java.util.List;
import java.util.Optional;

import com.fernando.cadastro.model.Curso;
import com.fernando.cadastro.repository.CursoRepository;

/* import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn; */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoRepository repository;

    @GetMapping
    public ResponseEntity<List<Curso>> listar(){
        List<Curso> cursosList = repository.findAll();
        if (cursosList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            /* for (Curso curso : cursosList) {
               Integer id = curso.getId();
               curso.add(linkTo(methodOn(CursoController.class).buscarProduto(id)).withSelfRel());
            } */
            return new ResponseEntity<List<Curso>>(cursosList, HttpStatus.OK);
        }     
    }

    @PostMapping()
    public void incluir(@RequestBody Curso curso){
        repository.save(curso);
    }

	@PutMapping()
	public void alterar(@RequestBody Curso curso){
		repository.save(curso);
	}

    @GetMapping(value="/filter/{nome}")
    public Iterable<Curso> listar(@PathVariable("nome") String nome) {
        return repository.findByNomeContaining(nome);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @DeleteMapping()
    public void deleteByParam(@RequestParam("id") Integer id, @RequestParam("nome") String nome) {
        repository.deleteById(id);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Curso> buscarProduto(@PathVariable(value = "id") Integer id) {
        Optional<Curso> cursoEspecifico = repository.findById(id);
        if (!cursoEspecifico.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            /* cursoEspecifico.get().add(linkTo(methodOn(CursoController.class).listar()).withRel("Lista de Cursos")); */
            return new ResponseEntity<Curso>(cursoEspecifico.get(), HttpStatus.OK);
        }
    }
    
}
