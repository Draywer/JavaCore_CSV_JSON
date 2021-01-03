package ru.idcore;

import com.google.gson.reflect.TypeToken;
import org.xml.sax.SAXException;
import ru.idcore.service.JSONFile;
import ru.idcore.service.Separator;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Parser
 */
public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        String csvFile = "task1.csv";
        String xmlFile = "task2.xml";
        String csvJsonFile = "csv_to_json.json";
        String xmlJsonFile = "xml_to_json.json";
        String jsonFile = "task3.json";


        //ЗАДАЧА №1
        //CSV -> JSON
        EmployeeCSV employeeCSV = new EmployeeCSV();
        List<Employee> empCSVList = employeeCSV.getObjFromCSVFileWithStrategy(
                csvFile,
                Separator.SEPARATOR_SEMICOLON.getSeparator(),
                new String[]{"id", "firstName", "secondName", "country", "age"});

        //запись массива объектов Employee в json-файл
        JSONFile<Employee> employeeJSONFileFromCSV = new JSONFile<>();
        if (employeeJSONFileFromCSV.writeJSONFile(csvJsonFile, empCSVList)) {
            System.out.println("Файл " + csvFile + " преобразован в " + csvJsonFile);
        }


        //ЗАДАЧА № 2
        //XML -> JSON
        EmployeeXML employeeXML = new EmployeeXML();
        Staff staff = employeeXML.getObjFromXMLFile(xmlFile);

        List<Employee> empXMLList = staff.getList();

        //запись массива объектов Employee в json-файл
        JSONFile<Employee> employeeJSONFileFromXML = new JSONFile<>();
        if (employeeJSONFileFromXML.writeJSONFile(xmlJsonFile, empXMLList)) {
            System.out.println("Файл " + xmlFile + " преобразован в " + xmlJsonFile);
        }


        //ЗАДАЧА №3
        //JSON -> Java Objects
        JSONFile<Employee> employeeFromJSON = new JSONFile<>();
        Type userListType = new TypeToken<List<Employee>>() {}.getType();
        List<Employee> employees = employeeFromJSON.getObjFromJSONFile(jsonFile, userListType);
        System.out.println("\nСписок работников из " + jsonFile);
        employees.forEach(System.out::println);
    }
}

