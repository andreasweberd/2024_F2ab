package org.iukf2

class Zahlung {
    BigDecimal betrag
    Date datum
    static belongsTo = [kreditkarte: Kreditkarte]

    static constraints = {
    }
}