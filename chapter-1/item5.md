# Dê preferência à injeção de dependência pra integrar recursos
Classes dependem de um ou mais recursos subjacentes, como por exemplo um corretor ortográfico 
depende de um decionário. Utilizar singleton ou classes utilitárias estáticas não é uma boa 
abordagem pois assim, é suposto que exista apenas um recurso, como por exemplo apenas um 
dicionário no caso do corretor ortográfico. </br>
Classes utilitárias estáticas e os singleton são inapropriados para as classes cujo comportamento 
é parametrizado por um recurso subjacente.</br>
Um padrão simples para atender este esse requisito é passar o recurso no construtor ao criar uma nova 
instância. Essa é uma forma de injeção de dependência (seguindo o exemplo: o dicionário é a  
dependência do corretor ortográfico e é injetado dentro do corretor ortográfico quando ele é criado).
[Exemplo](src/main/java/com/effectivejava/chapter1/item5)
