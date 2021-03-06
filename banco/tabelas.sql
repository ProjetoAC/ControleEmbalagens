﻿CREATE TABLE estados (
  IdEstado integer NOT NULL ,
  Nome varchar(50) NOT NULL DEFAULT '',
  Sigla char(2) NOT NULL DEFAULT '',
  CONSTRAINT PK_Estados PRIMARY KEY (IdEstado)
);

CREATE TABLE cidades (
  IdCIdade integer NOT NULL,
  IdEstado integer NOT NULL,
  Nome varchar(50) NOT NULL DEFAULT '',
  CONSTRAINT PK_Cidades PRIMARY KEY (IdCidade),
  CONSTRAINT FK_Cidades_IdEstado FOREIGN KEY (IdEstado) REFERENCES estados (IdEstado)
);

CREATE TABLE pessoas (
  IdPessoa integer NOT NULL ,
  IdCidade integer NOT NULL,
  Nome varchar(100) NOT NULL DEFAULT '',
  CPF varchar(14) NOT NULL DEFAULT '',
  RG varchar(11) NOT NULL DEFAULT '',
  Endereco varchar(100) NOT NULL DEFAULT '',
  Numero integer NOT NULL,
  Bairro varchar(50) NOT NULL DEFAULT '',
  Complemento varchar(50) NOT NULL DEFAULT '',
  CEP varchar(10) NOT NULL DEFAULT '',
  TelefoneFixo varchar(14) NOT NULL DEFAULT '',
  TelefoneCelular varchar(14) NOT NULL DEFAULT '',
  Email varchar(50) DEFAULT NULL,
  Sexo char(1) NOT NULL DEFAULT 'M',
  CONSTRAINT PK_Pessoas PRIMARY KEY (IdPessoa),
  CONSTRAINT FK_Pessoas_IdCidade FOREIGN KEY (IdCidade) REFERENCES cidades (IdCIdade)
);

CREATE TABLE empresas (
  IdEmpresa integer NOT NULL,
  IdCidade integer NOT NULL,
  Nome varchar(100) NOT NULL DEFAULT '',
  CNPJ varchar(19) NOT NULL DEFAULT '',
  Endereco varchar(100) NOT NULL DEFAULT '',
  Numero integer NOT NULL,
  Bairro varchar(50) NOT NULL DEFAULT '',
  Complemento varchar(50) NOT NULL DEFAULT '',
  CEP varchar(9) NOT NULL DEFAULT '',
  TelefoneFixo varchar(14) NOT NULL DEFAULT '',
  TelefoneCelular varchar(14) NOT NULL DEFAULT '',
  Email varchar(50) DEFAULT NULL,
  CONSTRAINT PK_Empresas PRIMARY KEY (IdEmpresa),
  CONSTRAINT FK_Empresas_IdCidade FOREIGN KEY (IdCidade) REFERENCES cidades (IdCIdade)
);

CREATE TABLE embalagens (
  IdEmbalagem integer not null,
  descricao varchar(50) not null,
  CONSTRAINT PK_Embalagens PRIMARY KEY (IdEmbalagem)
);

CREATE TABLE produtos (
  IdProduto integer NOT NULL,
  IdEmbalagem integer NOT NULL,
  Nome varchar(50) NOT NULL DEFAULT '',
  Descricao varchar(100) NOT NULL DEFAULT '',
  ClasseTox varchar(200) NOT NULL DEFAULT '',	
  CONSTRAINT PK_Produtos PRIMARY KEY (IdProduto),
  CONSTRAINT FK_Produtos_IdEmbalagem FOREIGN KEY (IdEmbalagem) REFERENCES embalagens (IdEmbalagem)
);

CREATE TABLE devolucao (
  IdDevolucao integer NOT NULL,
  IdPessoa integer NOT NULL,
  IdEmpresa integer NOT NULL,
  IdProduto integer NOT NULL,
  data date NOT NULL,
  quantidade integer NOT NULL,
  flagEntrega char(1) NOT NULL DEFAULT 'F',
  dataEntrega date,
  CONSTRAINT PK_Devolucao PRIMARY KEY (IdDevolucao),
  CONSTRAINT FK_Devolucao_IdEmpresa FOREIGN KEY (IdEmpresa) REFERENCES empresas (IdEmpresa),
  CONSTRAINT FK_Devolucao_IdPessoa FOREIGN KEY (IdPessoa) REFERENCES pessoas (IdPessoa),
  CONSTRAINT FK_Devolucao_IdProduto FOREIGN KEY (IdProduto) REFERENCES produtos (IdProduto)
);
