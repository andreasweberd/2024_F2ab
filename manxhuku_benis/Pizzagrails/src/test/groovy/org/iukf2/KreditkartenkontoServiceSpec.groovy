package org.iukf2

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class KreditkartenkontoServiceSpec extends Specification {

    KreditkartenkontoService kreditkartenkontoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Kreditkartenkonto(...).save(flush: true, failOnError: true)
        //new Kreditkartenkonto(...).save(flush: true, failOnError: true)
        //Kreditkartenkonto kreditkartenkonto = new Kreditkartenkonto(...).save(flush: true, failOnError: true)
        //new Kreditkartenkonto(...).save(flush: true, failOnError: true)
        //new Kreditkartenkonto(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //kreditkartenkonto.id
    }

    void "test get"() {
        setupData()

        expect:
        kreditkartenkontoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Kreditkartenkonto> kreditkartenkontoList = kreditkartenkontoService.list(max: 2, offset: 2)

        then:
        kreditkartenkontoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        kreditkartenkontoService.count() == 5
    }

    void "test delete"() {
        Long kreditkartenkontoId = setupData()

        expect:
        kreditkartenkontoService.count() == 5

        when:
        kreditkartenkontoService.delete(kreditkartenkontoId)
        sessionFactory.currentSession.flush()

        then:
        kreditkartenkontoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Kreditkartenkonto kreditkartenkonto = new Kreditkartenkonto()
        kreditkartenkontoService.save(kreditkartenkonto)

        then:
        kreditkartenkonto.id != null
    }
}
