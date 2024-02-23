package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User findUser(Long id);
    List<User> getAllUsers();
}
