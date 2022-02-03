package dao;

import model.Car;
import java.util.List;

public interface CarDao {
    List<Car> getAllCars();
    List<Car> getSeveralCars(int amount);
}
