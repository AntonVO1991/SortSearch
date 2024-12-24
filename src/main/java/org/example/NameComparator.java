package org.example;

import java.util.Comparator;

public class NameComparator implements Comparator<User> {
    @Override
    public int compare(User p1, User p2) {
        return p1.name.compareTo(p2.name);
    }
}
