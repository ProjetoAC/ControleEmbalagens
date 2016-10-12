--relatorio de quantidade de embalagens vazias que foram devolvidas
SELECT (SELECT SUM(quantidade) FROM devolucao WHERE flagentrega = 'T') AS qtdTotal, e.descricao, SUM(quantidade) FROM devolucao
INNER JOIN produtos p USING (idProduto)
INNER JOIN embalagens e USING (idEmbalagem) 
WHERE flagentrega = 'T'
GROUP BY e.descricao

--relatorio da quantidade de embalagens que faltam devolver
SELECT (SELECT SUM(quantidade) FROM devolucao WHERE flagentrega = 'F') AS qtdTotal, e.descricao, SUM(quantidade) FROM devolucao
INNER JOIN produtos p USING (idProduto)
INNER JOIN embalagens e USING (idEmbalagem) 
WHERE flagentrega = 'F'
GROUP BY e.descricao

--relatorio de quantidade de dias que a embalagem está aguardando devolucao

--relatorio de embalagem por produto
SELECT p.nome, e.descricao, SUM(d.quantidade) FROM devolucao d
INNER JOIN produtos p USING (idProduto)
INNER JOIN embalagens e USING (idEmbalagem)
GROUP BY p.nome, e.descricao

