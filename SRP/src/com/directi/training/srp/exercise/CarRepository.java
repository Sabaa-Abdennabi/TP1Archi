package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarRepository {
    // if we had a concrete database we would have seperated the logic to another file , while it  is not the case we kept it simple and effective
    private List<Car> _carsDb = Arrays
            .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
                    new Car("3", "Megane", "Renault"));

    public List<Car> getCars() {
        return _carsDb;
    }

    public Car getCarById(final String carId) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

}
