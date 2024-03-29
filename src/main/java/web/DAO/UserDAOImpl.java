package web.DAO;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@AllArgsConstructor
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private final EntityManager manager;

    @Override
    public void addUser(User user) {
        manager.persist(user);
    }


    @Override
    public void deleteUser(Long id) {
        manager.remove(manager.find(User.class, id));
    }

    @Override
    public User findUser(Long id) {
        return manager.find(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
        return manager.createQuery("select p from User p").getResultList();
    }
}
