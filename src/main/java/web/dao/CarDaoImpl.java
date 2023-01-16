package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDaoImpl implements CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Vaz", 1, 1960));
        cars.add(new Car("Mazda", 626, 1996));
        cars.add(new Car("Mercedes", 3, 1997));
        cars.add(new Car("BMW", 7, 2020));
        cars.add(new Car("VW", 5, 2000));
    }

    @Override
    public List<Car> getCars(int count) {
        if(count <= 0 || count >=5  ) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
