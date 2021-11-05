package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    List<Car> cars = List.of(
            new Car("VAZ", "13", 98),
            new Car("Mersedes", "E125", 96),
            new Car("Tayota", "Rav4", 2004),
            new Car("JEEP", "JEEP", 2014),
            new Car("Ferrari", "Drakon", 2012),
            new Car("Tesla", "Mesla", 2025),
            new Car("Bugati", "Mugati", 2045),
            new Car("Brabus", "Mrabus", 2026)
    );

    public List<Car> carChosenList(int x) {
        List<Car> list = new ArrayList<>();
        if (x <= 0) {
            return cars;
        } else {
            for (int i = 0; i < x && i < 5; i++) {
                list.add(cars.get(i));
            }
        }
        return list;
    }
}
