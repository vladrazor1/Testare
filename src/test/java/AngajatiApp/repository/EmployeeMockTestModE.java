package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeMockTestModE {
    EmployeeMock employeeMock = new EmployeeMock();

    Employee e0 = new Employee("Marius", "Pacuraru", "1234567890876", DidacticFunction.ASISTENT, 2500d);
    Employee e1;
    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
        System.out.println(employeeMock.getEmployeeList());
    }

    @Test
    public void modifyEmployeeFunctionTC_01() {

        DidacticFunction functieNoua = DidacticFunction.LECTURER;
        employeeMock.modifyEmployeeFunction(e0,functieNoua);

        System.out.println(functieNoua);
        System.out.println(employeeMock.getEmployeeList().get(0).getFunction());


        assertTrue("Functia nu este conforma",functieNoua.equals(employeeMock.getEmployeeList().get(0).getFunction()));
    }

    @Test
    public void modifyEmployeeFunctionNullValueTC_02() {

        DidacticFunction functieNoua = DidacticFunction.LECTURER;
        employeeMock.modifyEmployeeFunction(e1,functieNoua);

        System.out.println(functieNoua);
        System.out.println(employeeMock.getEmployeeList().get(0).getFunction());


        assertTrue("Functia  nu este conforma",functieNoua.equals(employeeMock.getEmployeeList().get(0).getFunction()));
    }

}