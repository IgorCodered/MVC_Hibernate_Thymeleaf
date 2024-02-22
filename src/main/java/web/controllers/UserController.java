package web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.User;
import web.service.UserService;

import javax.validation.Valid;
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

    @GetMapping("/users/createUser")
    public String createPages(ModelMap map) {
        User user = new User();
        map.addAttribute("user", user);
        return "createUser";
    }

    @PostMapping("/users/create")
    public String createUser(@ModelAttribute("user") @Valid User user, BindingResult result) {
        if (result.hasErrors()) return "createUser";
        service.addUser(user);
        return "redirect:/users";
    }
}
