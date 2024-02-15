package service;

import DAO.UserDAO;
import lombok.AllArgsConstructor;
import model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserDAO repository;
    @Override
    public void addUser(String name, String lastname, String email) {
        repository.addUser(name, lastname, email);
    }

    @Override
    public void updateUser(Long id) {
        repository.updateUser(id);
    }
}
