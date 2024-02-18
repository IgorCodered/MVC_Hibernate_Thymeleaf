package web.service;

import org.springframework.transaction.annotation.Transactional;
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
    @Transactional
    public void addUser(User user) {
        repository.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(Long id) {
        repository.updateUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        repository.deleteUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User findUser(Long id) {
        return repository.findUser(id);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return repository.getAllUsers();
    }
}
