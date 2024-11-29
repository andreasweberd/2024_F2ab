package org.iukf2

class Kunde {
    String name
    static hasMany = [konten: Kreditkartenkonto]

    static constraints = {
    }
}