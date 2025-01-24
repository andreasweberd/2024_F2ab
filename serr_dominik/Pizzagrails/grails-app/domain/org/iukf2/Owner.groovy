package org.iukf2

class Owner {

    String name
    String mail
    String phoneNumber

    static constraints = {
        name blank: false
        mail email: true, nullable: true
        phoneNumber nullable: true
    }
}