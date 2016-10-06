package com.info.instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext  context= new FileSystemXmlApplicationContext("beans.xml");
        kylo greet=(kylo)context.getBean("greetings");
        System.out.println(greet.Sayhello());
    }
}
