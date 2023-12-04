package br.com.vnwstreamquebrado;

public class Registration {
    public String username;
    public String password;

    public Registration(String username, String password, String emails) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password,
    }

    public void setEmail(String email) {
        this.email = email;



}
