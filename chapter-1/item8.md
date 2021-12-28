# Evite o uso dos finalizadores e dos cleaners
A partir do Java 9, os finalizadores ficaram obsoletos, porém ainda estão sendo utilizados pelas 
bibliotecas Java. A partir do Java 9 os finalizadores foram substituidos pelos *cleaners*. Os Cleaners 
são menos perigosos do que os finalizadores, mas ainda são imprevisíveis, lentos e geralmente 
desnecessários. No Java, o garbage collector recupera o armazenamento associado a um objeto quando este 
se torna inacessível, e isso não exige nenhum esforço extraordinário por parte do programador.