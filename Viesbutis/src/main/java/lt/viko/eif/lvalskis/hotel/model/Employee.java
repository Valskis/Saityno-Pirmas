package lt.viko.eif.lvalskis.hotel.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import jakarta.xml.bind.annotation.XmlAccessorOrder;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Represents Employee object which has id, name, surname and role variables and their getters and setters.
 * This class is responsible for getting, setting and printing Employee object variables.
 */
@XmlRootElement(name = "employee")
public class Employee {


    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String surname;
    private String role;


    public Employee(int id, String firstName, String lastName, String role) {
        this.id = id;
        this.name = firstName;
        this.surname = lastName;
        this.role = role;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("\tID: %s\n\t\t" +
                        "Name: %s\n\t\t" +
                        "Surname: %s\n\t\t" +
                        "Role: %s",
                this.id,
                this.name,
                this.surname,
                this.role);
    }

    private String constructorEmployeeString() {
        return String.format("Employee:\n\tName = %s\n\t" +
                        "Surname = %s\n\t" +
                        "Role = %s",
                this.name,
                this.surname,
                this.role);
    }

}