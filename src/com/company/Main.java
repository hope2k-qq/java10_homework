package com.company;

import com.company.car.Car;
import com.company.employee.Employee;
import com.company.student.Student;

import java.util.List;
import java.util.stream.Collectors;

import static com.company.employee.Employee.convertStudents;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = Car.createCarList(100);

        Car fastRedCar = cars.stream()
                .filter(car -> "red".equals(car.getColor()))
                .max((car1, car2) -> Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed()))
                .orElse(null);

        if (fastRedCar != null) {
            System.out.println("Fast red car: " + fastRedCar.getName() + ", " + fastRedCar.getColor() + ", " +
                    fastRedCar.getMaxSpeed());
        } else {
            System.out.println("Not red car!");
        }

        System.out.println("//////////");

        List<Student> students = Student.createStudentList(100);

        List<String> youngerStudents = students.stream()
                .filter(student -> student.getAge() < 16)
                .map(Student::getLastName)
                .collect(Collectors.toList());

        System.out.println("Surnames of students younger than 16: " + youngerStudents);

        System.out.println("//////////");

        List<Student> students2 = Student.createStudentList(100);

        double averagePoint = students2.stream()
                .mapToDouble(Student::getPoint)
                .average()
                .orElse(0);

        System.out.println("Average point: " + averagePoint);

        System.out.println("//////////");

        List<Employee> employees = convertStudents(students);

        System.out.println("Result:");
        employees.forEach(employee -> {
            System.out.println("Name: " + employee.getName() +
                    ", surname: " + employee.getSurname() +
                    ", patronymic: " + employee.getPatronymic() +
                    ", age: " + employee.getAge());
        });
    }
}
