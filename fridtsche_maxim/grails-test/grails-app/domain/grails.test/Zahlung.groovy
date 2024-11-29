package bank

class Zahlung {
    BigDecimal betrag
    Date datum
    static belongsTo = [kreditkarte: Kreditkarte]

    static constraints = {
    }
}