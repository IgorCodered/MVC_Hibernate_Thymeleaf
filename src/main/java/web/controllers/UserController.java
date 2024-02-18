package web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import web.model.User;
import web.service.UserService;

import java.util.List;


@Controller
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/users")
    public String allUser(Model map) {
        List<User> allUsers = service.getAllUsers();
        map.addAttribute("users", allUsers);
        return "user";
    }


    @PostMapping("/users/create")
    public String createUser(ModelMap model) {
        User user = new User();
        model.addAttribute("user", user);
        return "redirect:/users";
    }
}
