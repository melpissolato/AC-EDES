# AC-EDES
ACS EDES finalizadas

LISTA DE ACs POO 
 
Escreva um programa que, a partir de um input do usuário, calcule a média salarial dos 3 funcionários de uma startup.  
Input: nomes dos 3 funcionários e seus respectivos salários. 
Output: 
Nomes dos 3 funcionários e seus respectivos salários. 
Média salarial final. 
Escreva um programa que, a partir de um input do usuário, use a fórmula de Bhaskara para resolver equações do 2º grau, ou seja, encontrar as raízes da equação. 
Input: valores de a, b e c. 
Output:  
Valores inseridos de a, b e c. 
Valores de  Δ, x1 e x2.
Saída esperada para equação: x2 - 3x - 54 = 0 
Δ = 225.0 
x1 = 9.0 
x2 = -6.0
Fórmula: 
 
Escreva um programa que, a partir de um input do usuário, calcule a área e volume de um cilindro.
Área cilindro = 2 * π * raio * (raio + altura)
Volume cilindro = π * raio2 * altura
Input: raio e altura do cilindro.
Output: área e volume do cilindro.
Exemplo:
Raio = 5.0 e Altura = 8.0
Área = 408.20
Volume = 628.00

Escreva um programa que, a partir de um input do usuário, verifique se um aluno foi aprovado em um curso sobre Java. Considere as seguintes questões:
O curso tem um total de 40 aulas e 2 avaliações (provas);
Para ser aprovado:
O aluno deve ter nota maior ou igual a 7 nas duas avaliações;
O aluno deve ter no mínimo 75% de presença.
Input: Nome do aluno, nota prova 1, nota prova 2 e quantidade de faltas.
Output: nome do aluno, média e seu status: Aprovado ou Reprovado.
Escreva um programa que, a partir de um input do usuário, faça operações matemáticas simples (soma, subtração, multiplicação e divisão) em dois valores.
Input: 
Número 1;
Número 2;
Operação a ser realizada.
Output:
Operação inserida;
Resultado da operação;
Mensagem de erro em caso de divisão por 0 (zero).

Escreva um programa em Java que simule uma transferência via PIX.
O usuário deve digitar uma senha para acessar o sistema. O usuário tem até 3 tentativas para inserir a senha correta. Senha correta: J@vaPOO.
O programa deve conter os seguintes valores pré-definidos: Saldo da Conta de Origem: R$ 1.000,00, Limite de Transação para PIX: R$ 500,00 e Saldo da Conta de Destino: R$ 2.000,00.
Após autenticação, o usuário deve informar: Chave PIX de destino (sem validação externa) e Valor da transferência (em reais).
O sistema deve verificar o saldo e limite do PIX antes de realizar a transação.
Após a tentativa (bem-sucedida ou não), o sistema deve exibir um relatório com as informações: Valor da transferência. Resultado da transferência (realizada ou negada). Saldo final de origem. Limite Transação PIX. Saldo final de destino.
Escreva um programa que, a partir de um input do usuário, calcule a área e volume de um cilindro. O programa deve conter a classe Cilindro com seus atributos e métodos.
Área cilindro = 2 * π * raio * (raio + altura)
Volume cilindro = π * raio2 * altura
Input: raio e altura do cilindro.
Output: área e volumo do cilindro.
Exemplo:
Raio = 5.0 e Altura = 8.0
Área = 408.20
Volume = 628.00
Escreva um programa em Java que calcule o valor a média final de um aluno, considerando: 
O professor deve informar o nome do aluno e número de matricula;
O professor deve informar o valor da Avaliação 1 (Peso 4), Avaliação 2 (Peso 4) e Atividade Complementar (Peso 2);
O sistema deve calcular a média na nota do aluno e:
Se média for maior ou igual a 7, o aluno está aprovado e o professor não precisa de lançar a nota da Avaliação Substitutiva (Substitui a menor nota entre A1 e A2); 
Se média menor que 7, o sistema solicitar ao professor para lançar a nota da Avaliação Substitutiva e deve calcular a nova média final do aluno.
O sistema deve imprimir as informações finais do aluno: Matrícula, Nome Aluno, Nota A1, Nota A2, Nota AS (Caso exista), Média Final e Status (Aprovado ou Reprovado).
O professor pode inserir notas de diferentes alunos até encerrar a execução do programa.
Criar um sistema em Java para simular operações bancárias entre clientes, utilizando apenas uma classe Cliente.
O cliente deve conter os seguintes atributos: nome, CPF, número da conta e saldo.
O sistema deve conter as seguintes operações:
Depositar: aumenta o saldo do cliente.
Sacar: reduz o saldo, somente se houver saldo suficiente.
Transferir: transfere um valor da conta atual para a conta de outro cliente, somente se houver saldo suficiente.
Exibir dados de um cliente com todos atributos.
O sistema não deve permitir saldos negativos.
O sistema deve apresentar as operações disponíveis em um menu.
O usuário pode executar as operações disponíveis até encerrar a execução do programa.
Escreva um programa que, a partir de um input do professor, calcule o valor a média final de um aluno em uma disciplina, considerando que: 
O professor deve informar o número de avaliações que serão inseridas para o aluno (não existe um limite para a quantidade de avaliações);
O professor deve informar o valor das avaliações (0 – 10);
O sistema deve calcular e imprimir a média final do aluno.


Escreva um programa que, a partir de um input do professor, calcule o valor a média final de toda a turma em uma disciplina, considerando que: 
O professor deve informar o número de alunos da turma;
O professor deve informar o número total de avaliações que serão inseridas para cada aluno;
O professor deve informar o valor das avaliações (0 – 10);
O sistema deve calcular e imprimir a média final da turma.
Escreva um programa que, a partir de um input do usuário, calcule o valor total de uma compra e valor das parcelas do pagamento, considerando que: 
Produto possui: nome e valor.
O usuário pode inserir quantos produtos desejar na sua cesta de compra.
O usuário deve informar o nome do produto e seu valor para adicionar o produto a cesta.
Ao encerrar a inserção de produtos na cesta, o sistema deve
Solicitar o número de parcelas de pagamento.
Calcular o valor final da compra.
Calcular o valor de cada parcela.
Imprimir o resumo da compra.

Escreva um programa que relacione um ingresso com seu comprador, considerando que: 
O comprador possui nome e CPF.
O bilhete possui um número de ingresso e descrição do show.
Um cliente pode comprar um único bilhete e o bilhete pertence a um único cliente (1-1).
O sistema deve registrar a venda do bilhete para o comprador.
O sistema deve imprimir um resumo da transação.

Escreva um programa que relacione um funcionário e sua carteira de trabalho, considerando que:
Cada funcionário deve possuir exatamente uma carteira de trabalho.
Funcionário possui: nome, cargo e salário.
Carteira de trabalho possui:  número, data de emissão e órgão emissor.
O sistema deve registrar o cadastro do funcionário e sua carteira de trabalho.
Por meio do teclado, crie pelo menos dois funcionários com suas respectivas carteiras e exiba os dados de cada um para simular o vínculo oficial entre empregado e carteira de trabalho no contexto de uma empresa.
Sacar: reduz o saldo, somente se houver saldo suficiente.
Transferir: transfere um valor da conta atual para a conta de outro cliente, somente se houver saldo suficiente.
Exibir dados de um cliente com todos atributos.
O sistema não deve permitir saldos negativos.
O sistema deve apresentar as operações disponíveis em um menu.
O usuário pode executar as operações disponíveis até encerrar a execução do programa.
