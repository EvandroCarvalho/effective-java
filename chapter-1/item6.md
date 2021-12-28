# Evite a criação de objetos desnecessários
Indica-se a reutilização de um único objeto em vez de criar um novo. A reutilização é mais rápido e 
sofisticada. Muitas vezes é possível evitar a criação de objetos desnecessários utilizando os 
*static factory methods* ([item1](/src/main/java/com/effectivejava/chapter1/item1)). Por exemplo, 
o metodo factory ```Boolean.valueOf(String)``` é mais aconselhável que o construtor ```Boolean(String)```, 
o construtor deve criar um objeto novo a cada vez que é chamado, enquanto nunca se exige que o método de 
fabricação faça isso. </br>
O String.matchers é um jeito fácil de verificar se uma string corresponde a uma expressão regular, 
no entanto é necessário ter cuidado, pois não é apropriado para uso em repetição, pois ele cria 
internamente uma instância *Pattern* para cada repetição 
([exemplo](/src/main/java/com/effectivejava/chapter1/item6)). </br>
Outro mode de criar objetos descenessários é o *autoboxing*, que permite combinar tipos primitivos e 
tipos primitivos *wappers*, fazendo *autoboxing* e *autounboxing* automaticamente
([exemplo](/src/main/java/com/effectivejava/chapter1/item6)).</br>
Dê preferência aos tipos primitivos do que aos tipos primitivos wappers, e tome cuidado com o 
autoboxing, involuntário.

