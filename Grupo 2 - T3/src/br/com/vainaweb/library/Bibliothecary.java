package br.com.vainaweb.library;

public class Bibliothecary {
    
    String name;
    int code;

    public Bibliothecary(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String toString() {
		return " ID: " + this.getCode() + "\n" 
				+ " Nome: " + this.getName();
	}
}
