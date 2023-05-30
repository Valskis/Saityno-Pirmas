package lt.viko.eif.lvalskis.hotel.Tests;

import lt.viko.eif.lvalskis.hotel.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Represents a EmployeeTest object that tests Employee class.
 */
public class EmployeeTest {

    @Test
    public void testSetAndGetId() {
        Employee employee = new Employee();
        int id = 1;
        employee.setId(id);
        Assertions.assertEquals(id, employee.getId());
    }

    @Test
    public void testSetAndGetName() {
        Employee employee = new Employee();
        String name = "John";
        employee.setName(name);
        Assertions.assertEquals(name, employee.getName());
    }

    @Test
    public void testSetAndGetSurname() {
        Employee employee = new Employee();
        String surname = "Doe";
        employee.setSurname(surname);
        Assertions.assertEquals(surname, employee.getSurname());
    }

    @Test
    public void testSetAndGetRole() {
        Employee employee = new Employee();
        String role = "Manager";
        employee.setRole(role);
        Assertions.assertEquals(role, employee.getRole());
    }
}
