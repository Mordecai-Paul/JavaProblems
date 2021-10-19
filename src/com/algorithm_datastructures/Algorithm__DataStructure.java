package com.algorithm_datastructures;

public class Algorithm__DataStructure {
    public static void main (String args[]){
      CreditCard [] wallet = new CreditCard[3];
      wallet[0] = new CreditCard("John Bowman" ,"California Savings",
              "5391 0375 9387 5309",5000);
      wallet[1] = new CreditCard("John Bowman", "California Federal",
              "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance",
                "5391 0375 9387 5309", 2500, 300);

        for(int val = 1; val < 16; val++){
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
        }

        for(CreditCard card: wallet){
            CreditCard.printSummary(card);
            while(card.getBalance() > 200.0){
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }

        }

    }
}


class CreditCard {
    //instance variables:
    private String customer; // name of the customer (e.g., ”John Bowman”)
    private String bank;    // name of the bank (e.g., ”California Savings”)
    private String account; // account identifier (e.g., ”5391 0375 9387 5309”)
    private int limit;     // credit limit (measured in dollars)
    protected double balance;  // current balance (measured in dollars)

    public CreditCard(String cust, String bk, String acnt, int lim, double intialBal) {
        this.customer = cust;
        this.bank = bk;
        this.account = acnt;
        this.limit = lim;
        this.balance = intialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    //Accessor Methods:

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    //update methods:
    public boolean charge(double price) {
        if (price + balance > limit)        //make a charge
            return false;                   //if charge would surpass limit
                                            //refuse the charge.
        //at this point, the charge is successful.
        balance = balance + price;          //update the balance.
        return true;                        //announce the good news.
    }

    public void makePayment(double amount){ //make a payment
        balance =  balance - amount;
    }
    //utility method to print a cards information.
    public static void printSummary(CreditCard card){
        System.out.println("Customer" + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account =" + card.account);
        System.out.println("Balance=" + card.balance); //implicit cast
        System.out.println("Limit=" + card.limit);  //implicit cast
    }

}