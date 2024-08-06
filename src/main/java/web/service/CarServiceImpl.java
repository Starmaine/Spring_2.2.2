package web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    private static final Logger logger = LoggerFactory.getLogger(CarServiceImpl.class);

    private List<Car> carList = Arrays.asList(
            new Car("Model S", 1, 2020),
            new Car("Mustang", 2, 2018),
            new Car("Civic", 3, 2019),
            new Car("Corolla", 4, 2021),
            new Car("Camry", 5, 2020)
    );

    @Override
    public List<Car> getCars(int count) {
        logger.info("Requested count: {}", count);
        if (count <= 0 || count > carList.size()) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
