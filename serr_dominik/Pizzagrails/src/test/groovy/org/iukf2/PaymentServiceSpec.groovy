package org.iukf2

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PaymentServiceSpec extends Specification {

    PaymentService zahlungService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Zahlung(...).save(flush: true, failOnError: true)
        //new Zahlung(...).save(flush: true, failOnError: true)
        //Zahlung zahlung = new Zahlung(...).save(flush: true, failOnError: true)
        //new Zahlung(...).save(flush: true, failOnError: true)
        //new Zahlung(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //zahlung.id
    }

    void "test get"() {
        setupData()

        expect:
        zahlungService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Payment> zahlungList = zahlungService.list(max: 2, offset: 2)

        then:
        zahlungList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        zahlungService.count() == 5
    }

    void "test delete"() {
        Long zahlungId = setupData()

        expect:
        zahlungService.count() == 5

        when:
        zahlungService.delete(zahlungId)
        sessionFactory.currentSession.flush()

        then:
        zahlungService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Payment zahlung = new Payment()
        zahlungService.save(zahlung)

        then:
        zahlung.id != null
    }
}
