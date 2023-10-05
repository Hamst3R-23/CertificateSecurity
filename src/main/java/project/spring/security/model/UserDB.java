package project.spring.security.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.HashSet;
import java.util.Set;

public class UserDB {

    private String name;

    private Set<Role> roles;

    private Set<Certificate> certificate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Certificate> getCertificate() {
        return certificate;
    }

    public void setCertificate(Set<Certificate> certificate) {
        this.certificate = certificate;
    }

    public Set<GrantedAuthority> getAuthorities(){

        HashSet<GrantedAuthority> authorities = new HashSet<>();

        for (Role role : this.getRoles())
            authorities.add(new SimpleGrantedAuthority(role.getName()));

        return authorities;
    }

}
