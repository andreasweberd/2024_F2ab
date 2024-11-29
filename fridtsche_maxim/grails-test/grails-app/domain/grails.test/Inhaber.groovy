package grails.test

public class Inhaber {
    String name
    static hasMany = [kreditkarten: Kreditkarte]

    static constraints = {
    }
}