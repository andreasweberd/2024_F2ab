package bank

class Kreditkartenkonto {
    static hasMany = [kreditkarten: Kreditkarte]
    Kunde kunde

    static constraints = {
    }
}