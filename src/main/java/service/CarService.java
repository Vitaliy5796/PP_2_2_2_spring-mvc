package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> indexCount(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 001));
        cars.add(new Car(2, "skoda", 002));
        cars.add(new Car(3, "VAZ", 003));
        cars.add(new Car(4, "peugeot", 004));
        cars.add(new Car(5, "DAF", 005));
        return cars.stream().limit(count).toList();
    }
}