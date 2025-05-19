package fr.andrew.model;

import java.util.HashMap;

public class PasswordVault {

    private static PasswordVault instance = null;
    private HashMap<String, String> passwords = new HashMap<>();
    private String nom;

    private PasswordVault(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addPassword(String service, String password){
        passwords.put(service, password);
    }

    public String getPassword(String service){
        String res = passwords.get(service);
        return res;
    }

    public static PasswordVault getInstance(){
        if (instance==null){
            instance = new PasswordVault("My Passwords");
            System.out.println("instace created");
        }
        System.out.println("return instance");
        return instance;
    };
}
