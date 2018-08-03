
package com.company;

public class Person {

    private String firstName;
    private String secondName;

    public Person(String firstName, String secondName) {
        setFirstName(firstName);
        this.secondName = secondName;
    }

    public Person(String fullName) {
        if (fullName != null) {
            String[] namePart = fullName.split(" ");
            setFirstName(namePart[0]);
            if (namePart.length > 1) {
                this.secondName = namePart[1];
            }
        }
    }

    public String getFullName() {
        return this.firstName + " " + this.secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName.substring(0, 1).toUpperCase() + secondName.substring(1);
    }
}
