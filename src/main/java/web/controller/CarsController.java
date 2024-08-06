package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarsController {

    private static final Logger logger = LoggerFactory.getLogger(CarsController.class);

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        logger.info("Received count parameter: {}", count);
        if (count == null || count <= 0) {
            count = carService.getCars(Integer.MAX_VALUE).size();
        }
        logger.info("Final count to be used: {}", count);
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}

