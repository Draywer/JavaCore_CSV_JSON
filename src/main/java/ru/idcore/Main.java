package ru.idcore;

import ru.idcore.service.CSVFile;
import ru.idcore.service.Delimiter;

import java.io.IOException;

/**
 * Parser CSV_JSON
 *
 */
public class Main
{
    public static void main( String[] args ) throws IOException {
        //System.out.println( "Hello World!" );
        CSVFile.about();

        String csvFile = "test.csv";
        CSVFile.createCSVFile("1,John,Smith,USA,25", csvFile, Delimiter.DELIMITER_COMMA, true );
    }
}
