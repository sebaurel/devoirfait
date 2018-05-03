package fr.WCS.devoirfait.dao;

import fr.WCS.devoirfait.model.User;

import java.util.List;

public interface  UserDAO {

    List<User> findAllUser();

    User findOneUser(String email);


}
