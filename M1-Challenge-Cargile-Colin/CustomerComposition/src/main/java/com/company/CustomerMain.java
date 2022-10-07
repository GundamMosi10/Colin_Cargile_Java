package com.company;

public class CustomerMain {

    public static void main(String[] args) {
        Address shippingAddress = new Address();
        shippingAddress.setStreet1("123 Private Street");
        shippingAddress.setStreet2(null);
        shippingAddress.setCity("Los Angeles");
        shippingAddress.setState("California");
        shippingAddress.setZip("90210");

        Address billingAddress = new Address();
        billingAddress.setStreet1("50 Spring Street");
        billingAddress.setStreet2(null);
        billingAddress.setCity("New York City");
        billingAddress.setState("New York");
        billingAddress.setZip("10010");

        Customer John = new Customer("John", "Hamm", "jhamm@gmail.com", 6465559999L, shippingAddress, billingAddress,true);

        System.out.println(John);
    }
}
