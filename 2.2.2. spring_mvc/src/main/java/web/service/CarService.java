package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Skoda Superb", 10000, "white"));
        carList.add(new Car("Ford Mondeo", 56000, "black"));
        carList.add(new Car("Cherry Tiggo", 15000, "ocean"));
        carList.add(new Car("Toyota Supra", 205000, "orange"));
        carList.add(new Car("Kia Sportage", 25000, "white"));

    }

    public List<Car> getCars(int count) {
        if ((count < 0) || (count > 5)) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }

}
