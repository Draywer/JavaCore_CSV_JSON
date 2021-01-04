package ru.idcore;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


class StaffTest {
    private Staff staff;

    @BeforeAll
    public static void globalSetUp() {
        System.out.println("Тестирование класса Staff...");
    }

    @BeforeEach
    void setUp() {
        staff = new Staff();
        staff.setList(new ArrayList<>());
        staff.getList().add(new Employee(1, "John", "Smith", "USA", 25));
        staff.getList().add(new Employee(2, "Inav", "Petrov", "RU", 23));
        staff.getList().add(new Employee(3, "Alex", "Gnatenko", "RU", 49));
    }

    @Test
    @DisplayName("Тест №1: Проверка размера массива")
    public void givenAList_whenChecksSize_thenCorrect() {
        System.out.println("Тест №1: Получение массива объектов из csv файла");
        assertThat(staff.getList(), hasSize(3));
        System.out.println("Пройден");
    }

    @Test
    @DisplayName("Тест №2: Массивы содержат одинаковые данные без учета их расположения в массиве")
    public void givenAListAndValues_whenChecksListForGivenValues_thenCorrect() {
        System.out.println("Тест №2: Массивы содержат одинаковые данные без учета их расположения в массиве");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(2, "Inav", "Petrov", "RU", 23));
        employeeList.add(new Employee(1, "John", "Smith", "USA", 25));
        employeeList.add(new Employee(3, "Alex", "Gnatenko", "RU", 49));

        assertThat(staff.getList(),
                containsInAnyOrder(employeeList.toArray()));
        System.out.println("Пройден");
    }

    @Test
    @DisplayName("Тест №3: Массив содержит необходимые данные")
    public void givenValueAndArray_whenValueIsOneOfArrayElements_thenCorrect() {
        System.out.println("Тест №3: Массив содержит необходимые данные");
        assertThat(new Employee(1, "John", "Smith", "USA", 25),
                isOneOf(staff.getList().toArray()));
        System.out.println("Пройден");
    }

    @Test
    @DisplayName("Тест №4: Массив объектов пустой")
    public void givenCollection_whenEmpty_thenCorrect() {
        System.out.println("Тест №4: Массив объектов пустой");
        Staff staff = new Staff();
        staff.setList(new ArrayList<Employee>());

        assertThat(staff.getList(), empty());
        System.out.println("Пройден");
    }

}