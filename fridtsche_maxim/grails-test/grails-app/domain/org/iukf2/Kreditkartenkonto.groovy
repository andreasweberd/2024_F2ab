package org.iukf2

class Kreditkartenkonto {
    static hasMany = [kreditkarten: Kreditkarte]
    Kunde kunde

    static constraints = {
    }
}