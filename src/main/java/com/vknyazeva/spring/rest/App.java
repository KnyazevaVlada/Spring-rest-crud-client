package com.vknyazeva.spring.rest;


import com.vknyazeva.spring.rest.configuration.MyConfig;
import com.vknyazeva.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

/*        //получение списка всех сотрудников
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);*/

/*        // получение данных о сотреднике по id
        Employee empByID = communication.getEmployee(2);
        System.out.println(empByID);*/

/*        //добавление нового сотрудника
        Employee employee = new Employee("Sveta", "Sokolova",
                "HR", 900);
        communication.saveEmployee(employee);*/

        //удаление сотрудника
        communication.deleteEmployee(8);



    }
}
