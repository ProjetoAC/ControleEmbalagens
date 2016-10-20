--relatorio de quantidade de embalagens vazias que foram devolvidas
SELECT (SELECT SUM(quantidade) FROM devolucao WHERE flagentrega = 'T') AS qtdTotal, e.descricao AS descricao, SUM(quantidade) 
FROM devolucao
INNER JOIN produtos p USING (idProduto)
INNER JOIN embalagens e USING (idEmbalagem) 
WHERE flagentrega = 'T'
GROUP BY e.descricao

--relatorio da quantidade de embalagens que faltam devolver
SELECT (SELECT SUM(quantidade) FROM devolucao WHERE flagentrega = 'F') AS qtdTotal, e.descricao AS descricao, SUM(quantidade) AS qtd
FROM devolucao
INNER JOIN produtos p USING (idProduto)
INNER JOIN embalagens e USING (idEmbalagem) 
WHERE flagentrega = 'F'
GROUP BY e.descricao

--relatorio de embalagem por produto
SELECT p.nome AS produto, e.descricao AS descrica, SUM(d.quantidade) AS qtd
FROM devolucao d
INNER JOIN produtos p USING (idProduto)
INNER JOIN embalagens e USING (idEmbalagem)
GROUP BY p.nome, e.descricao

--relotorio de embalagem por pessoa
SELECT a.nome AS pessoa, p.nome AS produto, SUM(d.quantidade) AS qtd 
FROM devolucao d
INNER JOIN pessoas a USING (idPessoa)
INNER JOIN produtos p USING (idProduto)
GROUP BY p.nome, a.nome
ORDER BY a.nome

--relatorio de embalagem por empresa
SELECT e.nome AS empresa, p.nome AS produto, SUM(d.quantidade) AS qtd 
FROM devolucao d
INNER JOIN empresas e USING (idEmpresa)
INNER JOIN produtos p USING (idProduto)
GROUP BY p.nome, e.nome
ORDER BY e.nome

--listagem de todos os produtos vazios ordenados por classe toxicologica
SELECT p.classetox, p.nome, SUM(d.quantidade) FROM devolucao d
INNER JOIN produtos p USING (idProduto)
WHERE flagentrega = 'F'
GROUP BY p.classetox, p.nome ORDER BY p.classetox, p.nome

