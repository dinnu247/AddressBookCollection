package com.addressbook;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class ContactDetails extends AddressBook {
    //Declaring Varaibles
    @CsvBindByName(column = "firstName",required = true)
    @CsvBindByPosition(position = 0)
    private String firstName;
    @CsvBindByName(column = "lastName",required = true)
    @CsvBindByPosition(position = 1)
    private String lastName;
    @CsvBindByName(column = "address",required = true)
    @CsvBindByPosition(position = 2)
    private String address;
    @CsvBindByName(column = "city",required = true)
    @CsvBindByPosition(position = 3)
    private String city;
    @CsvBindByName(column = "state",required = true)
    @CsvBindByPosition(position = 4)
    private String state;
    @CsvBindByName(column = "zipCode",required = true)
    @CsvBindByPosition(position = 5)
    private int zipCode;
    @CsvBindByName(column = "phoneNumber",required = true)
    @CsvBindByPosition(position = 6)
    private String phoneNumber;
    @CsvBindByName(column = "email",required = true)
    @CsvBindByPosition(position = 7)
    private String email;

    //parameterized Constructor
    public ContactDetails(String firstName, String lastName, String address, String city, String state, int zipCode, String phoneNumber, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    //Getters and Setters for Variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // overriding toString method
    @Override
    public String toString() {
        return "ContactDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
