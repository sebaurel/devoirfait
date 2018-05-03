package fr.WCS.devoirfait.dao;

import fr.WCS.devoirfait.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class JpaUserDAO implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> findAllUser() {


        return null;

    }


    @Override
    public User findOneUser(String email) {
          String JPQL_SELECT_PAR_EMAIL = "SELECT u FROM User u WHERE u.email=:email";
          String PARAM_EMAIL           = "email";


        User user;

        Query requete = em.createQuery( JPQL_SELECT_PAR_EMAIL );

        requete.setParameter( PARAM_EMAIL, email );

        user = (User) requete.getSingleResult();


        return user;
        }
}
