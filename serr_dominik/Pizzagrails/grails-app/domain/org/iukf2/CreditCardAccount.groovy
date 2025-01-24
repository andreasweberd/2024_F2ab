package org.iukf2

class CreditCardAccount {

    String accountNumber
    Customer customer

    static constraints = {
        accountNumber blank: false, unique: true
        customer unique: true
    }
}