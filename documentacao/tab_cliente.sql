create database mjv_db; 

CREATE TABLE tab_cliente (
	codigo serial NOT null PRIMARY KEY,
	pf_pj char(1) NOT NULL,
	razao_social_nome varchar (50) NOT NULL,
	cpf_cnpj varchar (14) NOT null, 
	telefone1 numeric (11) NOT NULL,
	telefone2 numeric (11) NULL,
	email varchar (70) NOT NULL,
    atividade_prof varchar (30) NOT NULL,
	cep char(8) NOT NULL,
	estado  char(2) NOT NULL,
	cidade varchar (50) NOT NULL,
	rua varchar (50) NOT NULL,
	numero varchar (6) NOT null,
	complemento varchar (30),
	bairro varchar (40) NOT NULL,
	site_instagram varchar (50)
);

SELECT * FROM tab_cliente;
