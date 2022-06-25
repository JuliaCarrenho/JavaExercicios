--EXERCÍCIOS

--01
SELECT *
FROM tipoCartao

--02
SELECT *
FROM Bandeiras

--03
SELECT Nome, DDD, Telefone, Email
FROM Clientes 

--04
SELECT idAgencia, Endereco, Cidade, Estado
FROM Agencias

--05
SELECT * 
FROM Clientes 
WHERE Cidade = 'Valinhos'

--06
SELECT *
FROM Contas
WHERE dataAbertura = 2011-10-13

--07
SELECT *
FROM Clientes
WHERE Renda >= 2000

--08
SELECT *
FROM Clientes
WHERE Cidade = 'São Paulo' AND rendaComprovada = 1

--09
SELECT *
FROM Contas
WHERE talaoCheque = 1 OR internetBanking = 0

--10
SELECT * 
FROM Cliente_Cartao
WHERE dataPedido BETWEEN 2011-10-01 AND 2011-10-30

--11
SELECT *
FROM Contas
WHERE idConta BETWEEN 10 AND 20 

--12
SELECT *
FROM Contas
WHERE idConta IN (1, 7, 9, 15, 20)

--13
SELECT *
FROM Clientes
WHERE Nome LIKE 'Ana%'

--14
SELECT *
FROM Clientes
WHERE Nome LIKE '%ão%'

--15
SELECT *
FROM Clientes
WHERE Nome LIKE '%el%'

--16
SELECT *
FROM Contas
ORDER BY Limite ASC

--17
SELECT *
FROM Bandeiras
ORDER BY idBandeira DESC

--18
SELECT TOP 20 *
FROM Clientes

--19
SELECT *
FROM tipoCartao
WHERE rendaMinima >= 2000 AND Internacional =1 

--20
SELECT TOP 10*
FROM Cliente_Cartao
WHERE Bloqueado = 1
ORDER BY Numero ASC
