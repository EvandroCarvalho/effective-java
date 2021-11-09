# Implemente a não instanciação através de construtores privados
As classes com agrupamentos de métodos e campos estáticos possuem uma má reputação, pois algumas 
pessoas abusam muito de seu uso para não ter que pensar em termos de objeto, porém elas ainda são bem úteis. </br>
Não se projetou classes utilitárias para ser instanciadas. Na ausência de construtores explicitos, 
o compilador fornece um construtor padrão público sem parâmetros. </br>
Tentar implementar a não instanciação ao transformar uma classe utilitária em uma abstrata não funciona. </br>
Induz o usuário a pensar erroneamente que a classe foi projetada para herança e as subclasses podem ser 
instanciadas. </br>
Desta maneira, pode-se fazer com que a classe não seja instanciável através da inclusão de construtores 
privados. </br>
[Exemplo](src/main/java/com/effectivejava/chapter1/item4). Como o construtor é explicito privado, 
ele é inacessível fora da classe. O AssertionError não é estritamente necessário, mas oferece proteção 
no caso de o construtor ser invocado acidentalmente dentro da classe.