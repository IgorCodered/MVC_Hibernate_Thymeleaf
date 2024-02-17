package web.service;

import web.DAO.UserDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserDAO repository;
    @Override
    public void addUser(User user) {
        repository.addUser(user);
    }

    @Override
    public void updateUser(Long id) {
        repository.updateUser(id);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteUser(id);
    }

    @Override
    public User findUser(Long id) {
        return repository.findUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.getAllUsers();
    }
}
