package com.directi.training.srp.exercise;

import java.util.List;

public class CarFormatter {
    private List<Car> _cars ;
    public CarFormatter(List<Car> carsDb) {
        _cars = carsDb;
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
