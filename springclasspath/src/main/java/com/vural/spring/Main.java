package com.vural.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by vural on 28-Feb-17.
 */
public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context1 = new FileSystemXmlApplicationContext("src\\main\\java\\com\\vural\\spring\\beans1.xml");
        //this bean runs under the java directory in the Eclipse IDE
        ConfigurableApplicationContext context2 = new ClassPathXmlApplicationContext("com\\vural\\spring\\beans2.xml");
        ConfigurableApplicationContext context3 = new FileSystemXmlApplicationContext("beans3.xml");

        Person person1 = (Person) context1.getBean("person");
        Person person2 = (Person) context2.getBean("person");
        Person person3 = (Person) context3.getBean("person");

        person1.speak();
        person2.speak();
        person3.speak();

        context1.close();
        context2.close();
        context3.close();
    }
}
