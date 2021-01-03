package ru.idcore;

import ru.idcore.service.CSVFile;

public class EmployeeCSV extends CSVFile<Employee> {
    public Class<Employee> getType() {
        return Employee.class;
    }
}

