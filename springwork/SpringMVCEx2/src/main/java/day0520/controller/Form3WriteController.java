package day0520.controller;

import day0520.dto.FoodDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Form3WriteController {
    @PostMapping("/read3")
    public String read3(
            @ModelAttribute FoodDto dto/*폼태그에서 같은 이름은 자동으로 읽어옴*/
            )
    {

        return "form3/result3";
    }
}
