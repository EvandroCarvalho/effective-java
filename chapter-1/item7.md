# Elimine referências obsoletas de objetos
Apesar da linguagem Java fazer o gerenciamento de memória através do *Garbage Collector*, não é 
prudente pensar que não há a necessidade de se preocupar. Por exemplo, se uma pilha cresce e, em 
seguida diminui, os objetos que foram removidos da pilha não serão coletados pelo *Garbage Collector* 
mesmo se o programa que usa a pilha não tiver mais referências deles. Isso ocorre porque a **pilha 
armazena as referências obsoletas**, que é uma referência que nunca mais será desreferenciada outra vez.</br>
Se uma referência de objeto for retirada involuntariamente, além de esse objeto ser excluído do 
*Garbage Collection* todos os objetos referenciados por ele também serão, e assim por diante.</br>
A correção para esse tipo de problema é simples: invalide as referências quando se tornarem obsoletas.</br>
No entanto, tenha muito cuidado, pois atribuir null às referências de objetos devem ser uma exceção, e 
não a regra. A melhor forma de eliminar uma referência obsoleta é **deixar a variável que contem a 
refêrencia fora do escopo. Isso acontece naturalmente se você definir cada variável em um escopo 
que seja o mais limitado possível.</br>
Outra fonte comum de vazamento de memória são os caches.</br>
Uma terceira forma comum e vazamento de memória são os listeners e ourtas funções de callback.