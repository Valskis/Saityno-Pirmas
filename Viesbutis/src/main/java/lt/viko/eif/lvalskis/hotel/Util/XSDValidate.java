package lt.viko.eif.lvalskis.hotel.Util;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

/**
 * Represents XSDValidate object which has validateXmlAgainstXsd method.
 * This class is responsible for validating xml against xsd.
 */
public class XSDValidate {

    public static void main(String[] args) {
        String xmlFilePath = "C:\\Users\\gtluk\\OneDrive\\Stalinis kompiuteris\\Viesbutis\\src\\main\\java\\org\\example\\generated.xml";
        String xsdFilePath = "C:\\Users\\gtluk\\OneDrive\\Stalinis kompiuteris\\Viesbutis\\src\\main\\java\\org\\example\\Employee.xsd";

        boolean isValid = validateXmlAgainstXsd(xmlFilePath, xsdFilePath);
        if (isValid) {
            System.out.println("XML document is valid against the XSD schema.");
        } else {
            System.out.println("XML document is not valid against the XSD schema.");
        }
    }


    public static boolean validateXmlAgainstXsd(String xmlFilePath, String xsdFilePath) {
        try {
            // Create a SchemaFactory instance
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            // Load the XSD schema
            Schema schema = schemaFactory.newSchema(new File(xsdFilePath));

            // Create a Validator instance
            Validator validator = schema.newValidator();

            // Validate the XML document
            Source source = new StreamSource(new File(xmlFilePath));
            validator.validate(source);

            return true; // Validation successful
        } catch (IOException | SAXException e) {
            // Validation failed
            e.printStackTrace();
            return false;
        }
    }
}

