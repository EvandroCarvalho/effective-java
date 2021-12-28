package com.effectivejava.chapter1.item6;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

public class StringMatchers {
    private static final Logger log = LoggerFactory.getLogger(StringMatchers.class);
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    /**
     * Neste caso uma instância do java.util.regex.Pattern é criada internamente a cada chamada do método
     * e é utilizada apenas uma vez
     */
//    static boolean isRomanNumeral(String s) {
//        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
//    }
    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        Map<String, String> map = Map.of("chave1", "valor1", "chave2", "valor2");
        Set<String> set1 = map.keySet();
        Set<String> set2 = map.keySet();

        log.info("São os mesmos objetos: {}", Objects.equals(set1, set2));
    }
}
