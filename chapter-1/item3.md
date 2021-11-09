# Implemente a propriedade de um singleton com um construtor privado ou um tipo enum
Um [singleton](https://refactoring.guru/pt-br/design-patterns/singleton) é um classe instanciada 
exatamente uma vez. </br>
Transformar uma classe em um singleton pode dificultar o teste de seus clientes.
A abordagem com [enums](src/main/java/com/effectivejava/chapter1/item3/ElvisEnum.java) 
é mais concisa e oferece uma garantia sólida constra as instâncias múltiplas, mesmo 
em casos de ataques sofisticados de serealização ou ataques por reflexões.