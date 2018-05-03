package fr.WCS.devoirfait.service;

import fr.WCS.devoirfait.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserService {

    public static void saveUser( User user ) {

    //http://www.oracle.com/technetwork/java/javamail/persistenceapi-135534.html
        // Create the EntityManager
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DevoirFait");
        EntityManager em = factory.createEntityManager();


        em.getTransaction().begin();


        em.persist( user );
        em.getTransaction( ).commit();

        em.close();
        factory.close();
    }


}
