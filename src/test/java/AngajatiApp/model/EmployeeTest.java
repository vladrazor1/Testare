package AngajatiApp.model;

import AngajatiApp.controller.DidacticFunction;
import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
       Employee e0,e1,e2,e3,e4,e5,e6;
    ArrayList<Employee> employeeList = new ArrayList<>();

    @Before
    public void setUp(){
        //Automat inainte de rularea testelor
        e0 = new Employee(); //employee sarac

        e1 = new Employee("Marius", "Pacuraru", "1234567890876", DidacticFunction.ASISTENT, 2500d);
        e2 = new Employee("Ion", "Dumitrescu", "1234567890876", DidacticFunction.LECTURER, 2500d);
        e3 = new Employee("Gicu", "Ionescu", "1234567890876", DidacticFunction.LECTURER, 2500d);
        e4 = new Employee("Dodel", "Pacuraru", "1234567890876", DidacticFunction.ASISTENT, 2500d);
        e5 = new Employee("Dorel", "Georgescu", "1234567890876", DidacticFunction.TEACHER, 2500d);
        e6  = new Employee("Larson", "Puscas", "1234567890876", DidacticFunction.TEACHER,  2500d);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

        System.out.println(employeeList);
    }

    @Test
    public void testSetDateNotNull(){
        for (Employee var:employeeList){
            assertNotNull(var.getFirstName());
            assertNotNull(var.getLastName());
            assertNotNull(var.getCnp());
            assertNotNull(var.getFunction());
            assertNotNull(var.getSalary());
        }
    }

    @Test
    public void IntentionatPentruFail(){
      try {
           Assert.assertEquals("Noupe",e1.getCnp() ,"1111111");
      }catch (Exception e){
          System.out.println("Am presupus gresit ca CNP-ul dau ar fi 1111111");
      }
    }

    @After
    public void tearDown(){
        System.out.println("Gata testul!");
    }

}