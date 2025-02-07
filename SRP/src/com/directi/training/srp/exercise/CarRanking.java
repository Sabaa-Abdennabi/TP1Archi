package com.directi.training.srp.exercise;

import java.util.List;

public class CarRanking {
    private List<Car> _cars ;
    private CarRepository  _carRepository = new CarRepository();
    public CarRanking() {
        _cars = _carRepository.getCars();
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : _cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
