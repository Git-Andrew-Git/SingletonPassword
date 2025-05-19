package fr.andrew;

import fr.andrew.model.PasswordVault;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        PasswordVault passwordVault = PasswordVault.getInstance();
        PasswordVault passwordVault1 = PasswordVault.getInstance();

        passwordVault.addPassword("google", "12345");
        passwordVault1.addPassword("facebook", "54321");

        System.out.println(passwordVault.getPassword("facebook"));
        System.out.println(passwordVault1.getPassword("google"));

        Objects ObjectUtils = null;
        System.out.println(ObjectUtils.toIdentityString(passwordVault));
        System.out.println(ObjectUtils.toIdentityString(passwordVault1));

    }
}