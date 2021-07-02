package com.fernando.cadastro;

import java.util.List;

import com.fernando.cadastro.model.Aluno;
import com.fernando.cadastro.model.Cadastro;
import com.fernando.cadastro.model.ContatoEmergencia;
import com.fernando.cadastro.model.Endereco;
import com.fernando.cadastro.model.enums.AlunoNivel;
import com.fernando.cadastro.repository.AlunoDao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(AlunoDao dao) throws Exception {
		return args -> {
			List<Aluno> alunos = dao.findAll();

			for(Aluno a : alunos) {
				//System.out.println(a.getCadastro().getNome() + " contato " + getCadastro().getContato().getNome());
			}

			Aluno a = new Aluno();
			a.setNivel(AlunoNivel.AV);
			
			Cadastro c = new Cadastro();
			c.setNome("Fernando Falcone");
			c.setEmail("fernando@tla.com");
			c.setRg("1212");
			c.setCpf("9078899");
			c.setTelefone(1197889789789l);
			
			Endereco e = new Endereco();
			e.setBairro("CENTRO");;
			
			c.setEndereco(e);
			
			ContatoEmergencia ce = new ContatoEmergencia();
			ce.setNome("FRANK MARLON");
			ce.setTelefone(11987654321L);
			c.setContato(ce);
			
			a.setCadastro(c);
			
			dao.save(a);
		}
	}

}
