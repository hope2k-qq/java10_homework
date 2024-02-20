package com.company.employee;

import com.company.student.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int age;

    public Employee(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public static List<Employee> convertStudents(List<Student> students) {
        return students.stream()
                .map(student -> new Employee(student.getFirstName(), student.getLastName(), "-",
                        student.getAge()))
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
