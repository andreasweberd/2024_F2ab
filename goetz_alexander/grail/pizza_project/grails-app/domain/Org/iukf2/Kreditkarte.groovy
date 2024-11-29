package org.iukf2

class Kreditkarte {

    String kreditkartennummer

    static constraints = {
        kreditkartennummer blank: false, unique: true
    }
}
