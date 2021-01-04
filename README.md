# NetologyJava

Домашние задания по курсу "Java-разработчик". (Нетология, 2020-2021)

выполнил: Гнатенко А.

## 03. Курс JavaCore
### 03.05 Работа с файлами CSV, XML, JSON

##### Задача 1: CSV - JSON
##### Задача 2: XML - JSON
##### Задача 3: JSON - Java Object

###### Лог к задачам на конвертер
~~~ text
Файл task1.csv преобразован в csv_to_json.json
Файл task2.xml преобразован в xml_to_json.json

Список работников из task3.json
Employee{id=1, firstName='John', secondName='Smith', country='USA', age=25}
Employee{id=2, firstName='Inav', secondName='Petrov', country='RU', age=23}
Employee{id=3, firstName='Alex', secondName='Gnatenko', country='RU', age=49}

~~~

##### Лог к задачам на Тестирование
1. Для классов EmployeeCSV и EmployeeXML написаны unit тесты
2. Для класса Staff написаны Hamcrest тесты
~~~ text
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running ru.idcore.EmployeeCSVTest
Тестирование класса EmployeeCSV...
Тест №3: Получение класса параметра
Пройден
Тест №2: Запись массива объектов в csv - файл
Пройден
Тест №1: Получение массива объектов из csv файла
Пройден
Тестовый файл test_write_csv_with_stategy.csv удален
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.531 s - in ru.idcore.EmployeeCSVTest
[INFO] Running ru.idcore.EmployeeXMLTest
Тестирование класса EmployeeXML...
Тест №1: Получение класса параметра
Пройден
Тест №2: Получение массива объектов из csv файла
Пройден
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.864 s - in ru.idcore.EmployeeXMLTest
[INFO] Running ru.idcore.StaffTest
Тестирование класса Staff...
Тест №1: Получение массива объектов из csv файла
Пройден
Тест №3: Массив содержит необходимые данные
Пройден
Тест №4: Массив объектов пустой
Пройден
Тест №2: Массивы содержат одинаковые данные без учета их расположения в массиве
Пройден
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.064 s - in ru.idcore.StaffTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
~~~