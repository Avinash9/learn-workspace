package com.learn.springtut1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.Logic.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        System.out.println( "::::::::::::::Starting Spring Project::::::::::" );
        
        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();
    }
}
