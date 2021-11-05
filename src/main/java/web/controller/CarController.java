package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
class CarController {
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/cars")
    public String getCar(ModelMap model, @RequestParam(value = "count", defaultValue = "0", required = false) Integer count) {
        model.addAttribute("cars", carService.carChosenList(count));
        return "cars";
    }
}
