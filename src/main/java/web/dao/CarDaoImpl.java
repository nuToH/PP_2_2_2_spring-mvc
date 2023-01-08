package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDaoImpl implements CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Vaz", 1, 1960));
        cars.add(new Car("Vaz", 1, 1960));
        cars.add(new Car("Vaz", 1, 1960));
        cars.add(new Car("Vaz", 1, 1960));
        cars.add(new Car("Vaz", 1, 1960));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
