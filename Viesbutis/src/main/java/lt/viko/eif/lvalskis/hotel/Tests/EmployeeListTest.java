package lt.viko.eif.lvalskis.hotel.Tests;

import lt.viko.eif.lvalskis.hotel.model.Employee;
import lt.viko.eif.lvalskis.hotel.model.EmployeeList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a EmployeeListTest object that tests EmployeeList class.
 */
public class EmployeeListTest {

    @Test
    public void testSetAndGetEmployeeList() {
        EmployeeList employeeList = new EmployeeList();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "Manager"));
        employees.add(new Employee(2, "Jane", "Smith", "Receptionist"));
        employeeList.setEmployeeList(employees);
        Assertions.assertEquals(employees, employeeList.getEmployeeList());
    }

    @Test
    public void testToString() {
        EmployeeList employeeList = new EmployeeList();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "Manager"));
        employees.add(new Employee(2, "Jane", "Smith", "Receptionist"));
        employeeList.setEmployeeList(employees);
        Assertions.assertEquals("Employee list: [Employee{id=1, name='John', surname='Doe', role='Manager'}, Employee{id=2, name='Jane', surname='Smith', role='Receptionist'}]\n\t", employeeList.toString());
    }

    @Test
    public void testConstructor() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "Manager"));
        employees.add(new Employee(2, "Jane", "Smith", "Receptionist"));
        EmployeeList employeeList = new EmployeeList(employees);
        Assertions.assertEquals(employees, employeeList.getEmployeeList());
    }

    @Test
    public void testDefaultConstructor() {
        EmployeeList employeeList = new EmployeeList();
        Assertions.assertEquals(null, employeeList.getEmployeeList());
    }

    @Test
    public void testSetEmployeeList() {
        EmployeeList employeeList = new EmployeeList();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "Manager"));
        employees.add(new Employee(2, "Jane", "Smith", "Receptionist"));
        employeeList.setEmployeeList(employees);
        Assertions.assertEquals(employees, employeeList.getEmployeeList());
    }

    @Test
    public void testGetEmployeeList() {
        EmployeeList employeeList = new EmployeeList();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "Manager"));
        employees.add(new Employee(2, "Jane", "Smith", "Receptionist"));
        employeeList.setEmployeeList(employees);
        Assertions.assertEquals(employees, employeeList.getEmployeeList());
    }
}
