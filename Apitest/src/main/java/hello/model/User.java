package hello.model;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name = "login",nullable = false, unique = true)
    private String login;


    public User(String login) {
        this.login = login;

    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}

