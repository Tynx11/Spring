package hello.model;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    @Column(name = "login",nullable = false, unique = true)
    private String login;


    public User(String login) {
        this.login = login;
        this.id = getId();
        this.age = getAge();
    }

    public User() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "age", nullable = false, unique = false)
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


