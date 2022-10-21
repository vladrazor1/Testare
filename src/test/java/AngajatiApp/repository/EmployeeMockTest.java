package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EmployeeMockTest {

    static Employee e0,e1,e2,e3,e4,e5, e6, e7;
    EmployeeMock mock = new EmployeeMock();


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(mock.getEmployeeList());
    }

    @Test
    public void addEmployee_TC01() {

        e0 = new Employee("Dorel", "Piscot", "1950909125807", DidacticFunction.ASISTENT, 2500d);

        int employeeNumber = mock.getEmployeeList().size();


        try {
            mock.addEmployee(e0);
            assert(true);
            assertEquals(employeeNumber + 1, mock.getEmployeeList().size());
        }catch (Exception e){
            assert(false);
        }

    }

    @Test
    public void addEmployee_TC02() {

        e1 = new Employee("Marius", "Pacuraru", "1280415432597", DidacticFunction.ASISTENT, 2500d);

        int employeeNumber = mock.getEmployeeList().size();

        try {
            mock.addEmployee(e1);
            assertEquals(employeeNumber, mock.getEmployeeList().size()); //Nu trebuie sa ajunga aici
            assert (true);
        } catch (Exception e) {
            assert (false);
        }

    }

//    @Test
//    public void addEmployee_TC07() {
//        DidacticFunction cocalar;
//        e2 = new Employee("Dorel", "Piscot", "1950909125807",cocalar, 2500d);
//
//        int employeeNumber = mock.getEmployeeList().size();
//
//        try {
//            mock.addEmployee(e2);
//            assertEquals(employeeNumber, mock.getEmployeeList().size()); //Nu trebuie sa ajunga aici
//            assert(true);
//        }catch (Exception e){
//            assert(false);
//        }
//
//    }

//    @Test
//    public void addEmployee_TC07() {
//
//        DidacticFunction.BISNITAR = null;
//        e3 = new Employee("Dorel", "Piscot", "1950909125807",DidacticFunction.BISNITAR, 2500d);
//
//        int employeeNumber = mock.getEmployeeList().size();
//
//        try {
//            mock.addEmployee(e3);
//            assertEquals(employeeNumber, mock.getEmployeeList().size()); //Nu trebuie sa ajunga aici
//            assert(true);
//        }catch (Exception e){
//            assert(false);
//        }
//
//    }

//    @Test
//    public void addEmployee_TC06() {
//        e4 = new Employee("Dorel", "Piscot", "1950909125807",, 2500d);
//
//        int employeeNumber = mock.getEmployeeList().size();
//
//        try {
//            mock.addEmployee(e4);
//            assertEquals(employeeNumber, mock.getEmployeeList().size()); //Nu trebuie sa ajunga aici
//            assert(true);
//        }catch (Exception e){
//            assert(false);
//        }
//
//    }

    @Test
    public void addEmployee_TC04() {
        e5 = new Employee("Dorel", "Piscot", "1950909125807",DidacticFunction.BISNITAR, 0.0);

        int employeeNumber = mock.getEmployeeList().size();

        try {
            mock.addEmployee(e5);
            assertEquals(employeeNumber, mock.getEmployeeList().size()); //Nu trebuie sa ajunga aici
            assert(true);
        }catch (Exception e){
            assert(false);
        }

    }

//    @Test
//    public void addEmployee_TC05() {
//
//        double y = null;
//        double x;
//        e6 = new Employee("Dorel", "Piscot", "1950909125807",DidacticFunction.BISNITAR, y);
//
//        int employeeNumber = mock.getEmployeeList().size();
//
//        try {
//            mock.addEmployee(e6);
//            assertEquals(employeeNumber, mock.getEmployeeList().size()); //Nu trebuie sa ajunga aici
//            assert(true);
//        }catch (Exception e){
//            assert(false);
//        }
//
//    }

    @Test
    public void addEmployee_TC10() {

        e7 = new Employee("AAAA", "John", "1210101125807",DidacticFunction.ASISTENT, 1.0);

        int employeeNumber = mock.getEmployeeList().size();

        try {
            mock.addEmployee(e7);
            assertEquals(employeeNumber +1, mock.getEmployeeList().size()); //Nu trebuie sa ajunga aici
            assert(true);
        }catch (Exception e){
            assert(false);
        }

    }
}