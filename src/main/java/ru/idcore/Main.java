package ru.idcore;

import ru.idcore.service.JSONFile;

import java.io.IOException;
import java.util.*;

/**
 * Parser CSV_JSON
 */
public class Main {
    public static void main(String[] args) throws IOException {

        EmployeeCSV employeeCSV = new EmployeeCSV();
        List<Employee> list = employeeCSV.getCSVObj("test.csv", ';');

        list.forEach(System.out::println);


        JSONFile<Employee> employeeJSONFile = new JSONFile<>();
        String employeeJSON = employeeJSONFile.getJSONString(list);

        System.out.println(employeeJSON);

        if(employeeJSONFile.writeJSONFile(employeeJSON, "test.json")) {
            System.out.println("Файл json создан");
        }

    }


}
