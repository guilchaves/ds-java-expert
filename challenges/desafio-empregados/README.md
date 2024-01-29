<<<<<<< HEAD
# DESAFIO Contribuintes

Para calcular o imposto de renda que uma pessoa deve pagar, um país aplica as seguintes regras:


1) Imposto sobre salário: a pessoa paga imposto sobre seu salário conforme tabela:

Salário | Imposto
--|--
Abaixo de 3000 por mês | Isento
3000 até 5000 exclusive | 10%
5000 ou acima | 20%
2) Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de 15%.
3) Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto cobrado é de 20%.
4) A pessoa pode abater até 30% do seu imposto bruto devido com gastos médicos ou educacionais. Mas se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os gastos médicos e educacionais podem ser abatidos.

Você deve fazer um programa para ler os dados de N contribuintes, armazenando os dados desses contribuintes em uma lista. Depois, você deve mostrar, para cada contribuinte, um resumo do imposto conforme exemplo abaixo.</br>
Você deve utilizar uma classe TaxPayer conforme projeto ao lado para representar cada contribuinte. Repare que sua lista vai ter que ser uma List<TaxPayer>. </br>
Lembre-se de respeitar os nomes apresentados no projeto ao lado (como foi fornecido o projeto para você executar, você tem que respeitar a especificação do projeto). Sinta-se livre para implementar construtores pra facilitar a instanciação dos objetos.</br>

EXEMPLO
```
Quantos contribuintes você vai digitar? 2

Digite os dados do 1o contribuinte:
Renda anual com salário: 48000.00
Renda anual com prestação de serviço: 0.00
Renda anual com ganho de capital: 800.00
Gastos médicos: 400.00
Gastos educacionais: 5400.00

Digite os dados do 2o contribuinte:
Renda anual com salário: 189000.00
Renda anual com prestação de serviço: 55184.93
Renda anual com ganho de capital: 20000.00
Gastos médicos: 600.00
Gastos educacionais: 7500.00

Resumo do 1o contribuinte:
Imposto bruto total: 4960.00
Abatimento: 1488.00
Imposto devido: 3472.00

Resumo do 2o contribuinte:
Imposto bruto total: 50077.74
Abatimento: 8100.00
Imposto devido: 41977.74
```
#
CRITÉRIOS DE AVALIAÇÃO (TODOS PRECISAM ESTAR CORRETOS):
1) Nomes de classes, atributos, métodos e argumentos respeitando o projeto, bem como as convenções de nome para Java (classe com primeira letra maiúscula, e padrão "camel case" para atributos, variáveis e métodos.
2) Atributos corretos e devidamente encapsulados com métodos get/set.
3) Todos métodos corretos calculando os valores corretamente.
4) Comportamento do programa correto conforme exemplo.
=======
# DESAFIO Empregados OO

##### Java e Programação Orientada a Objetos Expert

Você deve fazer um programa para ler os dados de um departamento, que inclui seu endereço e seus empregados. Em seguida você deverá mostrar na tela um relatório de folha de pagamento, conforme exemplos.
</br>
Para resolver este problema, você deverá implementar as entidades conforme projeto abaixo. O método payroll() da classe Department é responsável por retornar o valor total da folha de pagamento do departamento.</br>

EXEMPLO: 
```
Nome do departamento: Vendas
Dia do pagamento: 10
Email: vendas@lojatop.com
Telefone: 99883355
Quantos funcionários tem o departamento? 2

Dados do funcionário 1:
Nome: João Silva
Salário: 8000.00

Dados do funcionário 2:
Nome: Maria Torres
Salário: 10000.00

FOLHA DE PAGAMENTO:
Departamento Vendas = R$ 18000.00
Pagamento realizado no dia 10
Funcionários:
João Silva
Maria Torres
Para dúvidas favor entrar em contato: vendas@lojatop.com
```
#
CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS):
1. Nomes de classes, atributos, métodos e argumentos respeitando o projeto, bem como as convenções de nome para Java
2. Implementação correta do modelo de entidades com composição de objetos
3. Implementação correta do método payroll() da classe Department
4. Programa principal seguindo estrutura proposta no enunciado do desafio
5. Implementação correta do método static showReport(Department dept)
6. Comportamento do programa correto conforme exemplo
>>>>>>> empregados/main
