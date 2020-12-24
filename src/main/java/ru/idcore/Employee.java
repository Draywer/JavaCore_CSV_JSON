package ru.idcore;

import java.util.Objects;

public class Employee {
    private long id;
    private String firstName;
    private String secondName;
    private String country;
    private int age;

    Employee() {

    }

    Employee(long id, String firstName, String secondName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.country = country;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() &&
                getAge() == employee.getAge() &&
                getFirstName().equals(employee.getFirstName()) &&
                getSecondName().equals(employee.getSecondName()) &&
                getCountry().equals(employee.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getSecondName(), getCountry(), getAge());
    }
}
