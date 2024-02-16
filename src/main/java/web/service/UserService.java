package web.service;

public interface UserService {
    void addUser(String name, String lastname, String email);
    void updateUser(Long id);
    void deleteUser(Long id);
}
