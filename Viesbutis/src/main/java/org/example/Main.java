package org.example;

import lt.viko.eif.lvalskis.hotel.Util.JaxbUtil;
import lt.viko.eif.lvalskis.hotel.model.EmployeeList;

public class Main {
    public static void main(String[] args) {
        EmployeeList employees = JaxbUtil.convertToPojo();
        System.out.println(employees);
        JaxbUtil.convertToXml(employees);
    }
}
