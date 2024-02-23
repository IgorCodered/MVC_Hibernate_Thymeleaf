package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    void deleteUser(Long id);

    User findUser(Long id);

    List<User> getAllUsers();
}
