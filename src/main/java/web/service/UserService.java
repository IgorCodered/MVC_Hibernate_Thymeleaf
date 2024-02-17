package web.service;

import web.model.User;

public interface UserService {
    void addUser(User user);
    void updateUser(Long id);
    void deleteUser(Long id);
}
