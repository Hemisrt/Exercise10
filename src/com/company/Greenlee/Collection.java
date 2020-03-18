package com.company.Greenlee;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Collection implements Iterable {
    public static List<Contact> list = new ArrayList<>();

    public static void addContact(Contact a) {
        list.add(a);
    }

    @Override
    public Iterator<Contact> iterator() {
        return list.iterator();
    }
}