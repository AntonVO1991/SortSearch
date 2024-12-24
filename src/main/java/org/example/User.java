package org.example;


public class User  implements Comparable<User>{
    public int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public User (String name1) {
        name = name1;
    }
    String name;


    @Override
    public int compareTo(User other) {
        return Integer.compare(this.age, other.age);
    }
}
