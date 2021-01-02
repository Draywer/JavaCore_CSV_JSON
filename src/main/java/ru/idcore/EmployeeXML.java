package ru.idcore;

import ru.idcore.service.XMLFile;


public class EmployeeXML extends XMLFile<Staff> {
    public Class<Staff> getType() {
        return Staff.class;
    }
}
