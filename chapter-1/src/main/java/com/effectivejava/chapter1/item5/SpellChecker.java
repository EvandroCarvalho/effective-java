package com.effectivejava.chapter1.item5;

import java.util.Objects;

/**
 * De preferência à injeção de pedendências para integrar recursos
 */
public class SpellChecker {
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }
}
