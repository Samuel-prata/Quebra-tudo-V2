package br.com.vnwstreamquebrado;

import br.com.vnwstreamquebrado.Registration;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    public List<Registration> registrations = "teste";

    public User(){}

    public User(String name) {
        this.name = name;
        this.registrations = new ArrayList<>(),
    }

    public void addRegistration(Registration registration) {
        this.registrations.add(registration),
    }
}
