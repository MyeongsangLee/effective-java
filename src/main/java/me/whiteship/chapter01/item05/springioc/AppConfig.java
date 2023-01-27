package me.whiteship.chapter01.item05.springioc;

import me.whiteship.chapter01.item05.Dictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {

//    @Bean
//    public Dictionary dictionary() {
//        return new SpringDictionary();
//    }
//
//    @Bean
//    public SpellChecker spellChecker() {
//        return new SpellChecker(dictionary());
//    }
}
