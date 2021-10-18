# Considere os métodos static factory em vez dos construtores (pag.5 a pag.40)

Uma classe pode fornecer um método <i>static factory</i> público, que é simplesmente um método
estático que retorna uma instância de classe. Mas não é o mesmo que o padrão <i> [Méthod Factory do GOF](https://refactoring.guru/pt-br/design-patterns/factory-method) </i>
 
## Vantagens
1. Ao contrário dos construtores ele tem nomes. Ex.: [Employee](src/main/java/com/effectivejava/chapter1/item1/Employee.java) 
2. Ao contrário dos construtores não precisa criar novo objeto sempre que invocados. (Menção 
Pattern [Flyweigh](https://refactoring.guru/pt-br/design-patterns/flyweight)) Ex.: [Permission](src/main/java/com/effectivejava/chapter1/item1/Permission.java)
3. Podem retornar um objeto de qualquer subtipo do próprio tipo de retorno. Ex. java.util.Collections
4. A classe do objeto retornado pode variar de chamada para chamada, em função dos parâmetros de entrada. 
Ex.: EnumSet. Outro exemplo é uma classe que retorna uma lista, e de acordo com a quantidade de elementos 
é utilizada uma estrutura de dados mais adequada. (BigO)
5. Não precisa existir a classe do objeto retornado quando a classe contém o método de escrita. 
Ex.: JDBC

## Desvantagem
1. A principal limitação é que sem construtores públicos ou protegidos, as classes não podem ser divididas 
em subclasses, ou seja, não podem ser estendidas.
2. São difíceis de serem encontrados pelos programadores.

## Convenções de nomenclatura
* **from** - **Método de conversão de tipo**, apresenta um único parâmetro e retorna uma instância 
correspondente **desse tipo**. Ex.: 

``LocalDate date = LocalDate.from(Instant.now());``

* **of** - **Método de agregação** que apresenta diversos parâmetros e retorna uma instância desse tipo 
que incorpora esses parâmetros. Ex.:

``Map<String, String> stringMap = Map.of("chave", "valor");``

* **valueOf** - **Alternativa verbosa ao <i>from</i> e ao <i>of</i>**. Ex.:

``String string = String.valueOf(1);``

* **instance** ou **getInstance** - Retorna uma instância que é descrita pelos seus parâmetros 
(se houver), mas não pode ter os mesmos valores. Ex.:

``Calendar.getInstance();``

* **create** ou **newInstance** - Semelhante ao instance e o getInstance, contudo, neste caso, 
cada chamada retorna **uma instância nova**. Ex.:

``getClass().getConstructor().getInstance()``

* **getType** - Igual ao getInstance, porem **Type** é o tipo do objeto retornado. Ex.:

``FileStore fileStore = Files.getFileStore(path);``

* **newType** - Igual ao newInstance, porem **Type** é o tipo do objeto retornado. Ex.:

``BufferedReader bufferedReader = Files.newBufferedReader(path);``

* **type** - Alternativa ao getType e ao newType. Ex.:

``List<Object> list = Collections.list(enumList);``

