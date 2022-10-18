package AngajatiApp.model;

import AngajatiApp.controller.DidacticFunction;
import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
     static Employee e0,e1,e2,e3,e4,e5,e6;
    static ArrayList<Employee> employeeList = new ArrayList<>();

    @BeforeAll
    public static void setUp(){
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
    }

    @Test
    @Order(2)
    @Timeout(5000)
    public void testSetDateNotNull(){
        for (Employee var:employeeList){
            assertNotNull(var.getFirstName());
            assertNotNull(var.getLastName());
            assertNotNull(var.getCnp());
            assertNotNull(var.getFunction());
            assertNotNull(var.getSalary());
        }
        System.out.println(employeeList);
    }

    @Test
    @Order(1)
    public void IntentionatPentruFail(){
      try {
           Assert.assertEquals("Noupe "," 1111111 ", e1.getCnp());
      }catch (Exception e){
          System.out.println("Am presupus gresit ca CNP-ul dau ar fi 1111111");
      }
    }

    @Disabled
    @Order(3)
    @Test
    public void nimic(){
            System.out.println("Nu trebuia sa vazi asta!");
    }

    @ParameterizedTest
    @ValueSource (strings={"Gigescu","Caprescu","Lenescu"})
    public void uzParametruIntrare(String nume){
        for (Employee var:employeeList){
            Assert.assertFalse("Hopa, vezi ca ai un nume naspa, Imi pare rau de tine", var.getLastName().contains(nume));
            System.out.println("Incercare cu:" + nume);
        }
    }








    @AfterAll
    public static void tearDown(){
        System.out.println("Gata testul!");
    }

}