package com.company.Greenlee;

import java.util.List;
import java.util.ArrayList;

public class Main {
    // Trenton Greenlee
    // 3/13/2020
    // Exercise 10
    // CSCI 1660 - Android Programming Fundamentals (Java)
    public static void main(String[] args) {
        Contact trenton = new Contact("Trenton", "trenton@gmail.com");
        Contact killoran = new Contact("Killoran", "killoran@cscc.edu");
        Collection.addContact(trenton);
        Collection.addContact(killoran);

        for (Contact contact : Collection.list) {
            contact.display();
        }
    }
}