package web.DAO;

public interface UserDAO {
    void addUser(String name, String lastName, String email);
    void updateUser(Long id);
    void deleteUser(Long id);
}
