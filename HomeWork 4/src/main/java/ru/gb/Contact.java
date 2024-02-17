package ru.gb;

public class Contact implements Printable {

    private String id;
    private StringBuilder phoneNumber = new StringBuilder();
    private String firstName;
    private String experience;

    public Contact(String id, String phoneNumber, String firstName, String experience) {
        this.id = id;
        this.phoneNumber.append(phoneNumber);
        this.firstName = firstName;
        this.experience = experience;
    }
    public StringBuilder getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.append("; " + phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object obj) {
        return this.firstName.equals(obj) && this.experience.equals(obj);
    }
    public boolean contains(String str) {
        return this.id.contains(str) || this.phoneNumber.toString().contains(str) || this.firstName.contains(str) || this.experience.contains(str);
    }

    @Override
    public void print() {
        System.out.println(this.id + " " + this.phoneNumber + " " + this.firstName + " " + this.experience);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}