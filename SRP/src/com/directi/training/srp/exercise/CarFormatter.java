package com.directi.training.srp.exercise;

import java.util.List;

public class CarFormatter {
    private List<Car> _cars;
    private CarRepository _carRepository = new CarRepository();

    public CarFormatter() {
        _cars = _carRepository.getCars();
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : _cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
