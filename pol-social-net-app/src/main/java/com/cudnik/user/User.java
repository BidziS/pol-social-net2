package com.cudnik.user;

import com.cudnik.authority.Authority;
import com.cudnik.base.entity.BaseEntity;
import com.cudnik.user.user_details.entity.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Bidzis on 9/14/2017.
 */
@Entity
@Table(name = "users")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_ID")
public class User extends BaseEntity {

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

    private UserDetails userDetails;

    @NotNull
    private boolean isActive;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "AUTHORITY_ID", referencedColumnName = "ID")
    private List<Authority> authorities;

    public User() {
    }

    public User(String email, String password, UserDetails userDetails, boolean isActive, List<Authority> authorities) {
        this.email = email;
        this.password = password;
        this.userDetails = userDetails;
        this.isActive = isActive;
        this.authorities = authorities;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
