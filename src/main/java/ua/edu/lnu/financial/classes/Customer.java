package ua.edu.lnu.financial.classes;

public class Customer {
    private String firtsName;
    private String secondName;
    private String city;
    private String accountNumber;

    public Customer(String firtsName, String secondName, String city, String accountNumber) {
        this(firtsName, secondName);
        this.city = city;
        this.accountNumber = accountNumber;
    }

    public Customer(String firtsName, String secondName) {
        this.firtsName = firtsName;
        this.secondName = secondName;
    }

    Customer() {
    }

    public void showCitizen(String cityName, Customer customer){
        if(customer.getCity().equals(cityName)){
            System.out.println(customer);
        }
    }

    @Override
    public String toString() {
        return "Customer with firtsName " + firtsName +
                ", secondName " + secondName +
                " live in city " + city +
                " and has accountNumber " + accountNumber;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String cardNumber) {
        this.city = cardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
