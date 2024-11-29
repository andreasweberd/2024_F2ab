package org.iukf2

class Inhaber {
    String name
    static hasMany = [kreditkarten: Kreditkarte]

    static constraints = {
    }
}