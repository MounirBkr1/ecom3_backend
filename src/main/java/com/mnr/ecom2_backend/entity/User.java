package com.mnr.ecom2_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
public class User {
@Id
    private String userName;
    private String userFirstName;
    private String userLastName;
    private String userPassword;

    //a Set is an unordered collection of unique elements
    @ManyToMany(fetch= FetchType.EAGER,
    cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns  = @JoinColumn(name="USER_ID"),
            inverseJoinColumns=@JoinColumn(name="ROLE_ID"))

    private Set<Role> role;
}
