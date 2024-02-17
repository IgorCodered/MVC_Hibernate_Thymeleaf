package web.DAO;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

@Repository
@AllArgsConstructor
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private final EntityManager manager;

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}
