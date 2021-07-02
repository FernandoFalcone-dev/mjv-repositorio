package com.fernando.cadastro.model;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fernando.cadastro.model.enums.Sexo;


@Entity
@Table(name = "tab_cadastro")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	@Column(length = 70, nullable = false)
	private String email;
	@Column(length = 20, nullable = false)
	private String rg;
	@Column(length = 15, nullable = false)
	private String cpf;
	@Column(length = 15, nullable = false)
	private Long telefone;
	
	@Embedded
	private Endereco endereco;
	
	private String nacionalidade;
	private LocalDate dataNascimento;
	
	@Embedded
	private ContatoEmergencia contato;
	
	@Embedded
	@AttributeOverrides( {
        @AttributeOverride(name="nome", column = @Column(name="ce2_nome") ),
        @AttributeOverride(name="email", column = @Column(name="ce2_email") ),
        @AttributeOverride(name="parentesco", column = @Column(name="ce2_parentesco") ),
        @AttributeOverride(name="telefone", column = @Column(name="ce2_telefone") )
	} )
	private ContatoEmergencia contato2;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getTelefone() {
		return this.telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public ContatoEmergencia getContato() {
		return this.contato;
	}

	public void setContato(ContatoEmergencia contato) {
		this.contato = contato;
	}

	public ContatoEmergencia getContato2() {
		return this.contato2;
	}

	public void setContato2(ContatoEmergencia contato2) {
		this.contato2 = contato2;
	}

	public Sexo getSexo() {
		return this.sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	
}
