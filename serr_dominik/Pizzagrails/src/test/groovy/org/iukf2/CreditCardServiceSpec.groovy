package org.iukf2

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CreditCardServiceSpec extends Specification {

    CreditCardService kreditkarteService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Kreditkarte(...).save(flush: true, failOnError: true)
        //new Kreditkarte(...).save(flush: true, failOnError: true)
        //Kreditkarte kreditkarte = new Kreditkarte(...).save(flush: true, failOnError: true)
        //new Kreditkarte(...).save(flush: true, failOnError: true)
        //new Kreditkarte(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //kreditkarte.id
    }

    void "test get"() {
        setupData()

        expect:
        kreditkarteService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CreditCard> kreditkarteList = kreditkarteService.list(max: 2, offset: 2)

        then:
        kreditkarteList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        kreditkarteService.count() == 5
    }

    void "test delete"() {
        Long kreditkarteId = setupData()

        expect:
        kreditkarteService.count() == 5

        when:
        kreditkarteService.delete(kreditkarteId)
        sessionFactory.currentSession.flush()

        then:
        kreditkarteService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CreditCard kreditkarte = new CreditCard()
        kreditkarteService.save(kreditkarte)

        then:
        kreditkarte.id != null
    }
}
