package grails.test
import grails.test.Inhaber
import grails.test.Kreditkarte
import grails.test.Kreditkartenkonto
import grails.test.Kunde
import grails.test.Zahlung

class BankController {

    def index() {

    }

    def createData() {
        def kunde = new Kunde(name: "Max Mustermann").save(flush: true)
        def konto = new Kreditkartenkonto(kunde: kunde).save(flush: true)
        def inhaber = new Inhaber(name: "Lisa Müller").save(flush: true)
        def kreditkarte = new Kreditkarte(nummer: "1234567890", inhaber: inhaber, kreditkartenkonto: konto).save(flush: true)
        new Zahlung(betrag: 100.00, datum: new Date(), kreditkarte: kreditkarte).save(flush: true)

        render "fucj!"
    }
}