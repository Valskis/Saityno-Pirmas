package lt.viko.eif.lvalskis.hotel.Util;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import lt.viko.eif.lvalskis.hotel.model.EmployeeList;

import java.io.*;

/**
 * Represents JaxbUtil object which has convertToXml, convertToPojo methods.
 * This class is responsible for converting xml to pojo and pojo to xml.
 */
public class JaxbUtil {
    public static void convertToXml(EmployeeList employees) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeList.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(employees, new File("C:\\Users\\gtluk\\OneDrive\\Stalinis kompiuteris\\Viesbutis\\src\\main\\java\\org\\example\\result.xml"));
            jaxbMarshaller.marshal(employees, System.out);
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }

    public static EmployeeList convertToPojo() {
        String fileName = "C:\\Users\\gtluk\\OneDrive\\Stalinis kompiuteris\\Viesbutis\\src\\main\\java\\org\\example\\employee.xml";
        File file = new File(fileName);

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(EmployeeList.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            EmployeeList employees = (EmployeeList) jaxbUnmarshaller.unmarshal(file);
            return employees;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

}
