package org.iukf2

class Location {
    String name
    String address
    String town
    String postalCode
    static constraints = {
        name blank: false, unique: true
        address blank: false
        town blank: false
        postalCode blank: false
    }
}
