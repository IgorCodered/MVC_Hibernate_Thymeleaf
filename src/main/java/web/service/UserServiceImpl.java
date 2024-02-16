package web.service;

import web.DAO.UserDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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

    @Override
    public void deleteUser(Long id) {
        repository.deleteUser(id);
    }
}
