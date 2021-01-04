package ru.idcore;

import org.junit.jupiter.api.*;
import ru.idcore.service.Separator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeCSVTest {

    private EmployeeCSV employeeCSV;
    private List<Employee> employeeList;
    private String[] strategy;
    private String csvFile;
    private static String csvTestFile;
    private Character separator;



    @BeforeAll
    public static void globalSetUp() {
        System.out.println("Тестирование класса EmployeeCSV...");
    }

    @BeforeEach
    void setUp() {
        //System.out.println("Инициализация переменных для тестирования");
        employeeCSV = new EmployeeCSV();
        csvTestFile = "test_write_csv_with_stategy.csv";
        csvFile = "task1.csv";
        strategy = new String[]{"id", "firstName", "secondName", "country", "age"};
        separator = Separator.SEPARATOR_SEMICOLON.getSeparator();
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"John","Doe","USA",12));
        employeeList.add(new Employee(2,"Jane","Smith","Canada",23));
        employeeList.add(new Employee(3,"Alex","Gnatenko","Russia",49));
    }

//    @AfterEach
//    void tearDown() {
//    }

    @AfterAll
    static void deleteCSVFile() {

        File file = new File(csvTestFile);
        if(file.delete()){
            System.out.println("Тестовый файл " +  csvTestFile + " удален");
        }
    }


    @Test
    @DisplayName("Тест №1: Получение массива объектов из csv файла")
    void getObjFromCSVFileWithStrategy() {
        System.out.println("Тест №1: Получение массива объектов из csv файла");
        assertEquals(employeeList, employeeCSV.getObjFromCSVFileWithStrategy(
                csvFile,
                separator,
                strategy), "ОШИБКА! Массивы объектов не одинаковые");
        System.out.println("Пройден");
    }

    @Test
    @DisplayName("Тест №2: Запись массива объектов в csv - файл")
    void writeObjToCSVFileWithStrategy() throws IOException {
        System.out.println("Тест №2: Запись массива объектов в csv - файл");
        employeeCSV.writeObjToCSVFileWithStrategy(
                csvTestFile,
                separator,
                employeeList,
                strategy);
        File file = new File(csvTestFile);
        assertTrue(file.exists(), "ОШИБКА! Файл " + csvTestFile + " не создан");
        assertEquals(employeeList, employeeCSV.getObjFromCSVFileWithStrategy(
                csvTestFile,
                separator,
                strategy), "ОШИБКА! Массивы объектов не одинаковые");
        System.out.println("Пройден");
    }

    @Test
    @DisplayName("Тест №3: Получение класса параметра")
    void getType() {
        System.out.println("Тест №3: Получение класса параметра");
        Employee employee = new Employee();
        assertEquals(employee.getClass(), employeeCSV.getType(), "ОШИБКА! Классы не совпадают");
        System.out.println("Пройден");
    }
}