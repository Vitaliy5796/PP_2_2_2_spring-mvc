package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        if (count == null || Integer.valueOf(count) >= 5) {
            count = "5";
        }
        model.addAttribute("cars", CarService.indexCount(Integer.valueOf(count)));
        return "cars";
    }
}
