package application.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
public @Data class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;
    private String password;
    private boolean isActive;
    //private List<Roles> roles;
}
