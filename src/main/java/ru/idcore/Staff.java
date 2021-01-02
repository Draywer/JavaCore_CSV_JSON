package ru.idcore;

import jakarta.xml.bind.annotation.*;

import java.util.List;


@XmlRootElement(name = "staff")
@XmlAccessorType(XmlAccessType.FIELD)
public class Staff {

    @XmlElement(name = "employee")
    private List<Employee> list = null;

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }
}
