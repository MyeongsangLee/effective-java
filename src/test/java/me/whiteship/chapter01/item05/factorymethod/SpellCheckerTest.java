package me.whiteship.chapter01.item05.factorymethod;

import me.whiteship.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
        spellChecker.isValid("테스트");
    }

}