# NetologyJava

Домашние задания по курсу "Java-разработчик". (Нетология, 2020-2021)

выполнил: Гнатенко А.

## 03. Курс JavaCore
### 03.05 Работа с файлами CSV, XML, JSON

##### Задача 1: CSV - JSON
##### Задача 2: XML - JSON
##### Задача 3: JSON - Java Object


##### 
~~~text
Файл task1.csv преобразован в csv_to_json.json
Файл task2.xml преобразован в xml_to_json.json

Список работников из task3.json
Employee{id=1, firstName='John', secondName='Smith', country='USA', age=25}
Employee{id=2, firstName='Inav', secondName='Petrov', country='RU', age=23}
Employee{id=3, firstName='Alex', secondName='Gnatenko', country='RU', age=49}

~~~

##### Тестирование EmployeeCSV
~~~ text
"C:\Program Files\Java\jdk-14.0.2\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=52429:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\plugins\junit\lib\junit5-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\plugins\junit\lib\junit-rt.jar;C:\Users\User\IdeaProjects\JavaCore_CSV_JSON\target\test-classes;C:\Users\User\IdeaProjects\JavaCore_CSV_JSON\target\classes;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.7.0\junit-jupiter-engine-5.7.0.jar;C:\Users\User\.m2\repository\org\apiguardian\apiguardian-api\1.1.0\apiguardian-api-1.1.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-engine\1.7.0\junit-platform-engine-1.7.0.jar;C:\Users\User\.m2\repository\org\opentest4j\opentest4j\1.2.0\opentest4j-1.2.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-commons\1.7.0\junit-platform-commons-1.7.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.7.0\junit-jupiter-api-5.7.0.jar;C:\Users\User\.m2\repository\ru\idcore\csv-json-xml-lib\1.0.1\csv-json-xml-lib-1.0.1.jar;C:\Users\User\.m2\repository\com\google\code\gson\gson\2.8.5\gson-2.8.5.jar;C:\Users\User\.m2\repository\com\sun\xml\bind\jaxb-impl\3.0.0-M2\jaxb-impl-3.0.0-M2.jar;C:\Users\User\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\3.0.0-RC3\jakarta.xml.bind-api-3.0.0-RC3.jar;C:\Users\User\.m2\repository\com\sun\xml\bind\jaxb-core\3.0.0-M2\jaxb-core-3.0.0-M2.jar;C:\Users\User\.m2\repository\com\sun\activation\jakarta.activation\2.0.0-RC3\jakarta.activation-2.0.0-RC3.jar;C:\Users\User\.m2\repository\com\opencsv\opencsv\5.3\opencsv-5.3.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-lang3\3.11\commons-lang3-3.11.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-text\1.9\commons-text-1.9.jar;C:\Users\User\.m2\repository\commons-beanutils\commons-beanutils\1.9.4\commons-beanutils-1.9.4.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\User\.m2\repository\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-collections4\4.4\commons-collections4-4.4.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter\5.4.2\junit-jupiter-5.4.2.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.4.2\junit-jupiter-params-5.4.2.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-launcher\1.7.0\junit-platform-launcher-1.7.0.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 ru.idcore.EmployeeCSVTest
Тестирование класса EmployeeCSV...

Тест №3: Получение класса параметра
Пройден


Тест №2: Запись массива объектов в csv - файл
Пройден


Тест №1: Получение массива объектов из csv файла
Пройден

Тестовый файл test_write_csv_with_stategy.csv удален

Process finished with exit code 0
~~~