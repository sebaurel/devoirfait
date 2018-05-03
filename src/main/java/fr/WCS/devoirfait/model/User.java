package fr.WCS.devoirfait.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {


    @Id
    @GeneratedValue
    private int id;

    private String lastName;

    private String firsName;

    private String email;

    private String password;



    private int active;

    public User(int id, String lastName, String firsName, String email, String password, int active) {
        this.id = id;
        this.lastName = lastName;
        this.password = password;
        this.firsName = firsName;
        this.email = email;
        this.active = active;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
