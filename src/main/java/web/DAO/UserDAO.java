package web.DAO;

import web.model.User;

public interface UserDAO {
    void addUser(User user);
    void updateUser(Long id);
    void deleteUser(Long id);
}
