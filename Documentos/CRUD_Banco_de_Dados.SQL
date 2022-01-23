 --DROP TABLE public.despesa;
 --DROP TABLE public.inquilino;
 --DROP TABLE public.unidade;

CREATE TABLE public.unidade (
	codunidade serial4 NOT NULL,
	proprietario varchar(50) NOT NULL,
	condominio varchar(30) NOT NULL,
	endereco varchar(70) NOT NULL,
	CONSTRAINT unidade_pkey PRIMARY KEY (codunidade)
);


CREATE TABLE public.inquilino (
	codinquilino serial4 NOT NULL,
	nome varchar(50) NOT NULL,
	datanascimento date NOT NULL,
	sexo bpchar(1) NOT NULL,
	telefone varchar(15) NOT NULL,
	email varchar(50) NOT NULL,
	codunidade int4 NOT NULL,
	CONSTRAINT inquilino_pkey PRIMARY KEY (codinquilino)
);


CREATE TABLE public.despesa (
	coddespesa serial4 NOT NULL,
	codunidade int4 NOT NULL,
	descricao varchar(30) NOT NULL,
	tipo varchar(20) NOT NULL,
	valor numeric(8, 2) NOT NULL,
	vencimento date NOT NULL,
	statuspgto bool NOT NULL,
	CONSTRAINT despesa_pkey PRIMARY KEY (coddespesa, codunidade)
);


-- public.despesa foreign keys

ALTER TABLE public.despesa ADD CONSTRAINT despesa_codunidade_fkey FOREIGN KEY (codunidade) REFERENCES public.unidade(codunidade);

-- public.inquilino foreign keys

ALTER TABLE public.inquilino ADD CONSTRAINT inquilino_codunidade_fkey FOREIGN KEY (codunidade) REFERENCES public.unidade(codunidade);

-- PULAR TABELA UNIDADE

INSERT INTO public.unidade
(proprietario, condominio, endereco)
VALUES('Fernando Rodrigues', 'Magnus', 'Rua Amazonas,1400');

INSERT INTO public.unidade
(proprietario, condominio, endereco)
VALUES('Catia Colombo', 'Magnus', 'Rua Amazonas,1400');

INSERT INTO public.unidade
(proprietario, condominio, endereco)
VALUES('Fernanda Souza', 'Belo Mar', 'Rua Silva Pereira,100');

INSERT INTO public.unidade
(proprietario, condominio, endereco)
VALUES('Maria da Silva', 'Colina', 'Rua Getulio Vargas,150');

INSERT INTO public.unidade
(proprietario, condominio, endereco)
VALUES('João de Souza', 'Meu Lar', 'Rua Pedro Campos,250');

INSERT INTO public.unidade
(proprietario, condominio, endereco)
VALUES('Priscila', 'São Paulo', 'Rua São Paulos,20');

-- POPULAR TABELA INQUILINO

INSERT INTO public.inquilino
(nome, datanascimento, sexo, telefone, email, codunidade)
VALUES('Pedro de Jesus', '2000-01-01', 'M', '47-99999-0001', 'pedro@gmail.com', 1);

INSERT INTO public.inquilino
(nome, datanascimento, sexo, telefone, email, codunidade)
VALUES('Maria Rodrigues', '1980-02-01', 'F', '47-99999-0002', 'maria@gmail.com', 2);

INSERT INTO public.inquilino
(nome, datanascimento, sexo, telefone, email, codunidade)
VALUES('Julio Farias', '1985-03-01', 'M', '47-99999-0003', 'julioa@gmail.com', 3);

INSERT INTO public.inquilino
(nome, datanascimento, sexo, telefone, email, codunidade)
VALUES('Marta Pereira', '1960-04-01', 'F', '47-99999-0004', 'martaa@gmail.com', 4);

INSERT INTO public.inquilino
(nome, datanascimento, sexo, telefone, email, codunidade)
VALUES('João Severino', '1970-05-01', 'F', '47-99999-0005', 'joaoa@gmail.com', 5);

--POPULAÇÃO DA TABELA DESPESA


INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(1, 'Aluguel Janeiro', 'Aluguel', 1200, '2022-01-01', false);

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(1, 'Aluguel Março', 'Aluguel', 1200, '2022-03-01', false);

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(2, 'Aluguel Janeiro', 'Aluguel', 1200, '2022-01-01', True);

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(2, 'Aluguel Março', 'Aluguel', 1200, '2022-03-01', false);

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(3, 'Aluguel Janeiro', 'Aluguel', 1200, '2022-01-01', false);

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(3, 'Aluguel Março', 'Aluguel', 1200, '2022-03-01', false);

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(4, 'Aluguel Janeiro', 'Aluguel', 1200, '2022-01-01', true);

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(4, 'Aluguel Fevereiro', 'Aluguel', 1200, '2022-02-01',false );

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(4, 'Aluguel Março', 'Aluguel', 1200, '2022-03-01', false);


INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(5, 'Aluguel Janeiro', 'Aluguel', 1200, '2022-01-01', true);

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(5, 'Aluguel Fevereiro', 'Aluguel', 1200, '2022-02-01',true );

INSERT INTO public.despesa
(codunidade, descricao, tipo, valor, vencimento, statuspgto)
VALUES(5, 'Aluguel Março', 'Aluguel', 1200, '2022-03-01', true);

select *from despesa;