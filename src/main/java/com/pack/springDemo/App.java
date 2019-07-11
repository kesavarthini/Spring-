package com.pack.springDemo;

import java.beans.Beans;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Resource resource = new ClassPathResource("beans.xml"); 
      BeanFactory factory=new XmlBeanFactory(resource);
  //    Human obj=(Human)factory.getBean("woman");
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Choice:");
      String op=sc.nextLine();
      Human obj=(Human)factory.getBean(op);
      System.out.println(obj);
    }
}
