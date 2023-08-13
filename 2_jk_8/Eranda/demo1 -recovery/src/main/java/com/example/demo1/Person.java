package com.example.demo1;

public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String telNum;

    public Person(String firstName, String lastName, String address, String telNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.telNum = telNum;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                  "\n" + "lastName=" + lastName + '\n' + "address" + address + "telNum=" + telNum + '}';

    }
}
