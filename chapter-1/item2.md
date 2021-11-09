# Cogite o uso de um [builder](https://refactoring.guru/pt-br/design-patterns/builder) quando se deparar com muitos parâmetros no construtor

### Problema
Static factories e construtores compartilha da limitação de não se dar bem com uma quantidade grande 
de parâmetros opcionais. 

### Possíveis soluções
Tradicionalmente uma forma de lhe dar com este problema é utilizando o padrão 
[*Telescoping constructor*](http://www.javabyexamples.com/telescoping-constructor-in-java) que funciona, mas 
pode deixar mais complexa a tarefa quando se tem muitos parâmetros, além da dificuldade de ler o código. </br>
Uma segunda alternativa para muitos parâmetros opcionais é utilizar o padrão *Java Bens*, com ele você chama 
o construtor sem parâmetros para criar o objeto e na sequência chama os métodos de setter para definir 
os parâmetros de interesse. A desvantagem deste padrão, é que o JavaBean pode apresentar um estado parcialmente 
inconsistente durante sua construção, além de ecluir a possibilidade de uma classe ser imutável exigindo 
por parte do programador um esforço a fim de garantir a segurança da thread.

## Solução proposta
A soluçõa combina a segurança do padrão *telescoping constructor* com a legibilidade do padrão 
*JavaBeans*, trata-se do padrão [*Builder*](/src/main/java/com/effectivejava/chapter1/item2/builder/NutritionFacts.java). 
Em geral o builder é um membro de uma classe estática. </br>
Para identificar parâmetros inválidos verifique a validade nos métodos contrutor e no builder, se a 
verificação fallhar, lance uma *IllegalArgumentException*, cuja mensagem detalhada indica quaid parâmetros 
estão inválidos. </br>
Vale lembra também que no *Clean Code* o Robert C. Martin, sugere o uso de *Builder* em objetos que possuam mais de 3 
parâmetros. </br>
O padrão Builder se adéqua bem às [hierarquias de classes](/src/main/java/com/effectivejava/chapter1/item2/builderHierarquia)
 
# Desvantagens
Para criar um objeto, é necessario criar primeiro o builder, embora seja pouco provável que o custo de criação 
desse builder seja considerável na prática, isso pode um problema em situação crítica de desempenho. </br>
O padrão Builder é mais verboso do que o padrão telescoping constructor, logo, deve ser utilizado 
apenas parâmetros suficientes que justifiquem o uso, quatro parâmetros ou mais.
