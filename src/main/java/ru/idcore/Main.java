package ru.idcore;


import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Parser CSV_JSON
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Employee> beans = new CsvToBeanBuilder<Employee>(new FileReader("test.csv"))
                .withType(Employee.class).withSeparator(';').build().parse();

        beans.forEach(System.out::println);
    }


}
