package com.company;

public class Main {

    public static void main(String[] args) {

        Person johnSmith = new Person("John Smith");
        Person sarahConnor = new Person("Sarah Connor");

        johnSmith.setFirstName("patrik");

        System.out.println(johnSmith.getFullName());

        System.out.println(sarahConnor.getFullName());

    }
}
