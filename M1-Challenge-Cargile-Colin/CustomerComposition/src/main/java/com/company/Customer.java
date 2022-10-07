package com.company;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;
    private Address shippingAddress;
    private Address billingAddress;
    private boolean isARewardsMember;

    public Customer(){}

    public boolean isARewardsMemberYes() { return isARewardsMember; }

    public Customer(String firstName, String lastName, String email, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName, String email, long phoneNumber, Address shippingAddress, Address billingAddress, boolean isARewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.isARewardsMember = isARewardsMember;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isARewardsMember() {
        return isARewardsMember;
    }

    public void setARewardsMember(boolean ARewardsMember) {
        isARewardsMember = ARewardsMember;
    }

//    public static void Display() {
//        String street1 = String.valueOf("123 Private Street");
//        String street2 = null;
//        String city = String.valueOf("Los Angeles");
//        String state = String.valueOf("California");
//        String zip = String.valueOf(10010);
//
//        System.out.println(street1);
//        System.out.println(city);
//        System.out.println(state);
//        System.out.println(zip);
//    }
//
//    public static void main(String[] args) {
//        Display();
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                ", isARewardsMember=" + isARewardsMember +
                '}';
    }
}
