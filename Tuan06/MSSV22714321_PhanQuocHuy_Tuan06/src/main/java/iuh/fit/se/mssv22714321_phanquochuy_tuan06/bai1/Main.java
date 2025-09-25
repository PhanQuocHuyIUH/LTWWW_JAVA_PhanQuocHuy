package iuh.fit.se.mssv22714321_phanquochuy_tuan06.bai1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beans.xml");
        Clazz c1 = context.getBean("class1", Clazz.class);
        Student s1 = context.getBean("student1", Student.class);
        Student s2 = context.getBean("student2", Student.class);
        Student s3 = context.getBean("student3", Student.class);
        System.out.println(c1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
