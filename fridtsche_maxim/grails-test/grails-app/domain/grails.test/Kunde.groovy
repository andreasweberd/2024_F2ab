package bank

class Kunde {
    String name
    static hasMany = [konten: Kreditkartenkonto]

    static constraints = {
    }
}