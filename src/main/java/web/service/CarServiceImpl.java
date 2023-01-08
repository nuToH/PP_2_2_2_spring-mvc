package web.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;


import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public final CarDAO cars;

    @Autowired
    public CarServiceImpl(CarDAO cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.getCars(count);
    }
}