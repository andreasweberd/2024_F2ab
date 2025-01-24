package org.iukf2

class Customer {

    String username
    String password
    String email
    String customerID = UUID.randomUUID().toString()
    Location location
    static constraints = {
        username blank:false, unique: true
        password blank: false, password: true, minSize: 8
        email email: true, unique: true
        customerID generator: 'assigned'

    }
}