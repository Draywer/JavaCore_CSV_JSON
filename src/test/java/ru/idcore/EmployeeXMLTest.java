package ru.idcore;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeXMLTest {

    private Staff staff;
    private String xmlFile;
    private static String jsonTestFile;
    private EmployeeXML employeeXML;

    @BeforeAll
    public static void globalSetUp() {
        System.out.println("Тестирование класса EmployeeXML...");
    }

    @BeforeEach
    void setUp() {
        employeeXML = new EmployeeXML();
        xmlFile = "task2.xml";
        staff = new Staff();
        staff.setList(new ArrayList<>());
        staff.getList().add(new Employee(1,"John","Smith","USA",25));
        staff.getList().add(new Employee(2,"Inav","Petrov","RU",23));
        staff.getList().add(new Employee(3,"Alex","Gnatenko","RU",49));
    }

    @Test
    @DisplayName("Тест №2: Получение массива объектов из csv файла")
    void getObjFromXMLFile() {
        System.out.println("Тест №2: Получение массива объектов из csv файла");
        assertEquals(staff.getList(), employeeXML.getObjFromXMLFile(xmlFile).getList(), "ОШИБКА! Массивы объектов не совпадают");
        System.out.println("Пройден");
    }

    @Test
    @DisplayName("Тест №3: Получение класса параметра")
    void getType() {
        System.out.println("Тест №3: Получение класса параметра");
        assertEquals(staff.getClass(), employeeXML.getType(), "ОШИБКА! Классы не совпадают");
        System.out.println("Пройден");
    }
}