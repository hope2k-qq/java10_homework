package com.company.student;

import com.company.car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private String fullName;
    private int age;
    private String group;
    private int point;

    public Student(String fullName, int age, String group, int point) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
        this.point = point;
    }

    public static List<Student> createStudentList(int size) {
        Random random = new Random();
        List<String> names = List.of("Anton", "Anna", "Nikita", "Stepan", "Roman", "Taras");
        List<String> lastNames = List.of("Kozakevych", "Dotsenko", "Tolochko", "Velihorskyi", "Usenko", "Yarmolenko");

        List<String> groups = List.of("a101", "a102", "a103", "a104", "a105", "a106", "a107");

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String fullName = names.get(random.nextInt(names.size())) + " " +
                    lastNames.get(random.nextInt(lastNames.size()));
            int age = random.nextInt(10) + 14;
            String group = groups.get(random.nextInt(groups.size()));
            int point = random.nextInt(5) + 1;

            students.add(new Student(fullName, age, group, point));
        }

        return students;
    }

    public String getFirstName() {
        return fullName.split(" ")[0];
    }

    public String getLastName() {
        return fullName.split(" ")[1];
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
