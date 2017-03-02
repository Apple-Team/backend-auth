package models;

import javax.validation.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import play.db.jpa.*;
import play.data.validation.*;

import java.util.List;
import java.sql.Date;

import java.io.File;
import java.sql.Time;

/* Edited by Sridevi Akondi */

@Entity
@Table(name = "tb_member")

@SuppressWarnings("FieldCanBeLocal")
public class Member {


    public enum Role {
        ADMIN, USER
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @Column(name = "Username")
    private String username;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String pwd;

    @Column(name = "Role")
    private Role role;


    @Column(name="Auth_Token")
    private String authToken;

    public Member() {

    }


    public Member(int uid, String username, String email, String pwd, Role role) {
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.pwd = pwd;
        this.role = role;
    }


    public int getUid() { return uid; }
    public void setUid(int id) {
        this.uid= uid;
    }

    public String getUname() { return username; }
    public void setUname(String username) {
        this.username = username;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonIgnore
    public String getPwd() { return pwd; }
    public void setPwd(String pwd) {
        this.pwd= pwd;
    }

    public Role getRole() { return role; }
    public void setRole(Role role) {
        this.role = role; }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return authToken;
    }


}