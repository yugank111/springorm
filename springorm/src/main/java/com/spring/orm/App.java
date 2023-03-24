package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDAO;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
      StudentDAO studentDao=context.getBean("studentDao",StudentDAO.class);
      
      Student st1=new Student(2343,"harshit","Jaunpur");
      
      studentDao.insert(st1);
      
    }
}
