package lt.viko.eif.lvalskis.hotel.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;


/**
 * Represents EmployeeList object which has employeeList.
 * This class is responsible for getting, setting values of EmployeeList object variables and printing them.
 */
@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeList {

    public EmployeeList() {
    }


    @XmlElement(name = "employee")
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public EmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return String.format("Employee list: %s\n\t", this.employeeList);
    }
}
