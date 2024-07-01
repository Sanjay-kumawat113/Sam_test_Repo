package com.example.demo;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {






	
	public static void main(String args[]){    
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
           list.add("Ravi");//Adding object in arraylist  
           list.add("Vijay");  
           list.add("Ravi");  
           list.add("Ajay");  
            
           System.out.println("Traversing list through List Iterator:");  
           //Here, element iterates in reverse order  
              ListIterator<String> list1=list.listIterator(list.size());  
              while(list1.hasPrevious())  
              {  
                  String str=list1.previous();  
                  System.out.println(str);  
              }  
        System.out.println("Traversing list through for loop:");  
           for(int i=0;i<list.size();i++)  
           {  
            System.out.println(list.get(i));     
           }  
              
        list.forEach(System.out::println);
        itr.forEachRemaining(System.out::println);
              {  
            System.out.println(a);  
              });  
 }  
}}    
