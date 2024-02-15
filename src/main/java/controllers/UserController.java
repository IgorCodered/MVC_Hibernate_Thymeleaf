package controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import service.UserService;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/user")
    public String allUser(ModelMap map) {
        return "user";
    }
}
