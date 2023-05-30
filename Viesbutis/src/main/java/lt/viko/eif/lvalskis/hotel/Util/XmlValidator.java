package lt.viko.eif.lvalskis.hotel.Util;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

import org.xml.sax.InputSource;

import java.io.StringReader;

/**
 * Represents XmlValidator object which has validateXmlAgainstDtd method.
 * This class is responsible for validating xml against dtd.
 */
public class XmlValidator {
    public static void main(String[] args) {
        String xmlFilePath = "C:\\Users\\gtluk\\OneDrive\\Stalinis kompiuteris\\Viesbutis\\src\\main\\java\\org\\example\\employee.xml";
        String dtdFilePath = "C:\\Users\\gtluk\\OneDrive\\Stalinis kompiuteris\\Viesbutis\\src\\main\\java\\org\\example\\employee.dtd";

        validateXmlAgainstDtd(xmlFilePath, dtdFilePath);
    }

    public static void validateXmlAgainstDtd(String xmlFilePath, String dtdFilePath) {
        try {
            // Create a DocumentBuilderFactory
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

            // Enable DTD validation
            documentBuilderFactory.setValidating(true);

            // Specify the DTD validation schema
            documentBuilderFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            documentBuilderFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");

            // Create a DocumentBuilder
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            // Enable DTD validation using the specified DTD file
            documentBuilder.setEntityResolver((publicId, systemId) -> new InputSource(new StringReader("")));

            // Parse the XML document
            File xmlFile = new File(xmlFilePath);
            documentBuilder.parse(xmlFile);

            System.out.println("XML is valid against the DTD.");
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println("XML is not valid against the DTD. Error: " + e.getMessage());
        }
    }
}
