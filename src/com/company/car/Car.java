package com.company.car;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Car {
    private String name;
    private String color;
    private int maxSpeed;

    public Car(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public static List<Car> createCarList(int size) {
        Random random = new Random();
        List<String> colors = List.of("red", "blue", "green", "yellow", "white", "black");

        return random.ints(size, 1, 301)
                .mapToObj(speed -> new Car("Car" + (speed + 100), colors.get(random.nextInt(colors.size())), speed))
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
