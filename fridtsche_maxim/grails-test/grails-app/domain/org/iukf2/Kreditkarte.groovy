package org.iukf2

class Kreditkarte {
    Integer nummer
    static belongsTo = [inhaber: Inhaber, kreditkartenkonto: Kreditkartenkonto]

    static constraints = {
    }

}