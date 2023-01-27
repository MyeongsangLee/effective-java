package me.whiteship.chapter01.item05.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpellChecker spellchecker = applicationContext.getBean(SpellChecker.class);
        System.out.println(spellchecker.isValid("test"));
    }
}
