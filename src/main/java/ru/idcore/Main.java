package ru.idcore;

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


    }


}
