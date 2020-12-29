package ru.idcore;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.idcore.service.JSONFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Parser CSV_JSON
 */
public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

//        EmployeeCSV employeeCSV = new EmployeeCSV();
//        List<Employee> list = employeeCSV.getCSVObj("test.csv", ';');
//
//        list.forEach(System.out::println);
//
//
//        JSONFile<Employee> employeeJSONFile = new JSONFile<>();
//        String employeeJSON = employeeJSONFile.getJSONString(list);
//
//        System.out.println(employeeJSON);
//
//        if(employeeJSONFile.writeJSONFile(employeeJSON, "test.json")) {
//            System.out.println("Файл json создан");
//        }

        try {
            File inputFile = new File("test.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("employee");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
//                    System.out.println("Student roll no : "
//                            + eElement.getAttribute("rollno"));
                    System.out.println("id : "
                            + eElement
                            .getElementsByTagName("id")
                            .item(0)
                            .getTextContent());
                    System.out.println("firstName : "
                            + eElement
                            .getElementsByTagName("firstName")
                            .item(0)
                            .getTextContent());
                    System.out.println("secondName : "
                            + eElement
                            .getElementsByTagName("secondName")
                            .item(0)
                            .getTextContent());
                    System.out.println("country : "
                            + eElement
                            .getElementsByTagName("country")
                            .item(0)
                            .getTextContent());
                    System.out.println("age : "
                            + eElement
                            .getElementsByTagName("age")
                            .item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

